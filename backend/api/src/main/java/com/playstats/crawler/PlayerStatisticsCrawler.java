package com.playstats.crawler;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.playstats.mapping.RoRPlayer2PlayerMapper;
import com.playstats.model.Player;
import com.playstats.repository.PlayerRepository;

@Service
public class PlayerStatisticsCrawler {
	
	
	@Autowired private PlayerRepository playerRepository;
	@Autowired private RoRPlayer2PlayerMapper rorPlayer2PlayerMapper;
	
	@Scheduled(fixedDelay = 60_000)
	public void crawlPlayerStatistics() {

		RestTemplate restTemplate = initRestTemplate();
		long unixTime = Instant.now().getEpochSecond();
		RoRPlayer[] players = restTemplate.getForObject(
				"https://api.returnofreckoning.com/stats/online_list_new.php?realm_id=1&_=" + unixTime,
				RoRPlayer[].class);
		List<Player> playerList = rorPlayer2PlayerMapper.map2PlayerList(Arrays.asList(players));
		
		playerRepository.saveAll(playerList);
		
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
