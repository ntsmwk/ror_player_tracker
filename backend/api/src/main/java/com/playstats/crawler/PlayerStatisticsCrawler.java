package com.playstats.crawler;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.playstats.mapping.RoRPlayer2PlayerMapper;
import com.playstats.model.CareerLine;
import com.playstats.model.Player;
import com.playstats.model.statistics.ArchetypePopulationStatistic;
import com.playstats.model.statistics.CareerPopulationStatistic;
import com.playstats.model.statistics.RacePopulationStatistic;
import com.playstats.model.statistics.WorldArchetypePopulationStatistic;
import com.playstats.model.statistics.WorldPopulationStatistic;
import com.playstats.repository.ArchetypePopulationStatisticRepository;
import com.playstats.repository.CareerPopulationStatisticRepository;
import com.playstats.repository.PlayerRepository;
import com.playstats.repository.RacePopulationStatisticRepository;
import com.playstats.repository.WorldArchetypePopulationStatisticRepository;
import com.playstats.repository.WorldPopulationStatisticRepository;

@Service
public class PlayerStatisticsCrawler {

	@Autowired private PlayerRepository playerRepository;
	@Autowired private RoRPlayer2PlayerMapper rorPlayer2PlayerMapper;

	@Autowired private WorldPopulationStatisticRepository worldPopulationStatisticRepository;
	@Autowired private RacePopulationStatisticRepository racePopulationStatisticRepository;
	@Autowired private CareerPopulationStatisticRepository careerPopulationStatisticRepository;
	@Autowired private ArchetypePopulationStatisticRepository archetypePopulationStatisticRepository;
	@Autowired private WorldArchetypePopulationStatisticRepository worldArchetypePopulationStatisticRepository;

	@Scheduled(fixedDelay = 15*60_000)
	public void crawlPlayerStatistics() {

		RestTemplate restTemplate = initRestTemplate();
		long unixTime = Instant.now().getEpochSecond();
		RoRPlayer[] players = restTemplate.getForObject(
				"https://api.returnofreckoning.com/stats/online_list_new.php?realm_id=1&_=" + unixTime,
				RoRPlayer[].class);
		List<Player> playerList = rorPlayer2PlayerMapper.map2PlayerList(Arrays.asList(players));

		Date date = new Date();

		WorldPopulationStatistic worldPopulationStatistics = new WorldPopulationStatistic(date, playerList.size());
		RacePopulationStatistic racePopulationStatistics = new RacePopulationStatistic(date, playerList.size());
		CareerPopulationStatistic careerPopulationStatistics = new CareerPopulationStatistic(date, playerList.size());
		WorldArchetypePopulationStatistic worldArchetypePopulationStatistic = new WorldArchetypePopulationStatistic(
				date, playerList.size());
		ArchetypePopulationStatistic archetypePopulationStatistic = new ArchetypePopulationStatistic(date,
				playerList.size());

		for (Player player : playerList) {
			switch (player.getCareerLine()) {
//			Greenskin
			case CareerLine.BLACK_ORC:
				worldPopulationStatistics.incDestructionPopulation();
				racePopulationStatistics.incGreenskinPopulation();
				careerPopulationStatistics.incBlackOrcPopulation();
				worldArchetypePopulationStatistic.incDestructionTankPopulation();
				archetypePopulationStatistic.incTankPopulation();
				break;
			case CareerLine.CHOPPA:
				worldPopulationStatistics.incDestructionPopulation();
				racePopulationStatistics.incGreenskinPopulation();
				careerPopulationStatistics.incChoppaPopulation();
				worldArchetypePopulationStatistic.incDestructionMDpsPopulation();
				archetypePopulationStatistic.incmDpsPopulation();
				break;
			case CareerLine.SQUIG_HERDER:
				worldPopulationStatistics.incDestructionPopulation();
				racePopulationStatistics.incGreenskinPopulation();
				careerPopulationStatistics.incSquigHerderPopulation();
				worldArchetypePopulationStatistic.incDestructionRDpsPopulation();
				archetypePopulationStatistic.incrDpsPopulation();
				break;
			case CareerLine.SHAMAN:
				worldPopulationStatistics.incDestructionPopulation();
				racePopulationStatistics.incGreenskinPopulation();
				careerPopulationStatistics.incShamanPopulation();
				worldArchetypePopulationStatistic.incDestructionHealerPopulation();
				archetypePopulationStatistic.incHealerPopulation();
				break;
//			Dark Elfs
			case CareerLine.BLACK_GUARD:
				worldPopulationStatistics.incDestructionPopulation();
				racePopulationStatistics.incDarkElfPopulation();
				careerPopulationStatistics.incBlackGuardPopulation();
				worldArchetypePopulationStatistic.incDestructionTankPopulation();
				archetypePopulationStatistic.incTankPopulation();
				break;
			case CareerLine.WITCH_ELF:
				worldPopulationStatistics.incDestructionPopulation();
				racePopulationStatistics.incDarkElfPopulation();
				careerPopulationStatistics.incWitchElfPopulation();
				worldArchetypePopulationStatistic.incDestructionMDpsPopulation();
				archetypePopulationStatistic.incmDpsPopulation();
				break;
			case CareerLine.SORCERER:
				worldPopulationStatistics.incDestructionPopulation();
				racePopulationStatistics.incDarkElfPopulation();
				careerPopulationStatistics.incSorcererPopulation();
				worldArchetypePopulationStatistic.incDestructionRDpsPopulation();
				archetypePopulationStatistic.incrDpsPopulation();
				break;
			case CareerLine.DISCIPLE_OF_KHAINE:
				worldPopulationStatistics.incDestructionPopulation();
				racePopulationStatistics.incDarkElfPopulation();
				careerPopulationStatistics.incDiscipleOfKhainePopulation();
				worldArchetypePopulationStatistic.incDestructionHealerPopulation();
				archetypePopulationStatistic.incHealerPopulation();
				break;
//			Chaos
			case CareerLine.CHOSEN:
				worldPopulationStatistics.incDestructionPopulation();
				racePopulationStatistics.incChaosPopulation();
				careerPopulationStatistics.incChosenPopulation();
				worldArchetypePopulationStatistic.incDestructionTankPopulation();
				archetypePopulationStatistic.incTankPopulation();
				break;
			case CareerLine.MARAUDER:
				worldPopulationStatistics.incDestructionPopulation();
				racePopulationStatistics.incChaosPopulation();
				careerPopulationStatistics.incMarauderPopulation();
				worldArchetypePopulationStatistic.incDestructionMDpsPopulation();
				archetypePopulationStatistic.incmDpsPopulation();
				break;
			case CareerLine.MAGUS:
				worldPopulationStatistics.incDestructionPopulation();
				racePopulationStatistics.incChaosPopulation();
				careerPopulationStatistics.incMagusPopulation();
				worldArchetypePopulationStatistic.incDestructionRDpsPopulation();
				archetypePopulationStatistic.incrDpsPopulation();
				break;
			case CareerLine.ZEALOT:
				worldPopulationStatistics.incDestructionPopulation();
				racePopulationStatistics.incChaosPopulation();
				careerPopulationStatistics.incZealotPopulation();
				worldArchetypePopulationStatistic.incDestructionHealerPopulation();
				archetypePopulationStatistic.incHealerPopulation();
				break;
//			Dwarfs
			case CareerLine.IRONBREAKER:
				worldPopulationStatistics.incOrderPopulation();
				racePopulationStatistics.incDwarfPopulation();
				careerPopulationStatistics.incIronbreakerPopulation();
				worldArchetypePopulationStatistic.incOrderTankPopulation();
				archetypePopulationStatistic.incTankPopulation();
				break;
			case CareerLine.SLAYER:
				worldPopulationStatistics.incOrderPopulation();
				racePopulationStatistics.incDwarfPopulation();
				careerPopulationStatistics.incSlayerPopulation();
				worldArchetypePopulationStatistic.incOrderMDpsPopulation();
				archetypePopulationStatistic.incmDpsPopulation();
				break;
			case CareerLine.ENGINEER:
				worldPopulationStatistics.incOrderPopulation();
				racePopulationStatistics.incDwarfPopulation();
				careerPopulationStatistics.incEngineerPopulation();
				worldArchetypePopulationStatistic.incOrderRDpsPopulation();
				archetypePopulationStatistic.incrDpsPopulation();
				break;
			case CareerLine.RUNEPRIEST:
				worldPopulationStatistics.incOrderPopulation();
				racePopulationStatistics.incDwarfPopulation();
				careerPopulationStatistics.incRunePriestPopulation();
				worldArchetypePopulationStatistic.incOrderHealerPopulation();
				archetypePopulationStatistic.incHealerPopulation();
				break;
//			High Elfs
			case CareerLine.SWORDMASTER:
				worldPopulationStatistics.incOrderPopulation();
				racePopulationStatistics.incHighElfPopulation();
				careerPopulationStatistics.incSwordmasterPopulation();
				worldArchetypePopulationStatistic.incOrderTankPopulation();
				archetypePopulationStatistic.incTankPopulation();
				break;
			case CareerLine.WHITE_LION:
				worldPopulationStatistics.incOrderPopulation();
				racePopulationStatistics.incHighElfPopulation();
				careerPopulationStatistics.incWhiteLionPopulation();
				worldArchetypePopulationStatistic.incOrderMDpsPopulation();
				archetypePopulationStatistic.incmDpsPopulation();
				break;
			case CareerLine.SHADOW_WARRIOR:
				worldPopulationStatistics.incOrderPopulation();
				racePopulationStatistics.incHighElfPopulation();
				careerPopulationStatistics.incShadowWarriorPopulation();
				worldArchetypePopulationStatistic.incOrderRDpsPopulation();
				archetypePopulationStatistic.incrDpsPopulation();
				break;
			case CareerLine.ARCHMAGE:
				worldPopulationStatistics.incOrderPopulation();
				racePopulationStatistics.incHighElfPopulation();
				careerPopulationStatistics.incArchmagePopulation();
				worldArchetypePopulationStatistic.incOrderHealerPopulation();
				archetypePopulationStatistic.incHealerPopulation();
				break;
//			Empire
			case CareerLine.KNIGHT:
				worldPopulationStatistics.incOrderPopulation();
				racePopulationStatistics.incEmpirePopulation();
				careerPopulationStatistics.incKnightPopulation();
				worldArchetypePopulationStatistic.incOrderTankPopulation();
				archetypePopulationStatistic.incTankPopulation();
				break;
			case CareerLine.WHICH_HUNTER:
				worldPopulationStatistics.incOrderPopulation();
				racePopulationStatistics.incEmpirePopulation();
				careerPopulationStatistics.incWitchHunterPopulation();
				worldArchetypePopulationStatistic.incOrderMDpsPopulation();
				archetypePopulationStatistic.incmDpsPopulation();
				break;
			case CareerLine.BRIGHT_WIZARD:
				worldPopulationStatistics.incOrderPopulation();
				racePopulationStatistics.incEmpirePopulation();
				careerPopulationStatistics.incBrightWizardPopulation();
				worldArchetypePopulationStatistic.incOrderRDpsPopulation();
				archetypePopulationStatistic.incrDpsPopulation();
				break;
			case CareerLine.WARRIOR_PRIEST:
				worldPopulationStatistics.incOrderPopulation();
				racePopulationStatistics.incEmpirePopulation();
				careerPopulationStatistics.incWarriorPriestPopulation();
				worldArchetypePopulationStatistic.incOrderHealerPopulation();
				archetypePopulationStatistic.incHealerPopulation();
				break;
			}
		}

		playerRepository.saveAll(playerList);
		worldPopulationStatisticRepository.save(worldPopulationStatistics);
		racePopulationStatisticRepository.save(racePopulationStatistics);
		careerPopulationStatisticRepository.save(careerPopulationStatistics);
		archetypePopulationStatisticRepository.save(archetypePopulationStatistic);
		worldArchetypePopulationStatisticRepository.save(worldArchetypePopulationStatistic);

		System.out.println("fetched");
	}

	private RestTemplate initRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
		mappingJackson2HttpMessageConverter
				.setSupportedMediaTypes(Arrays.asList(MediaType.TEXT_HTML, MediaType.APPLICATION_JSON));
		restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);
		return restTemplate;
	}

}
