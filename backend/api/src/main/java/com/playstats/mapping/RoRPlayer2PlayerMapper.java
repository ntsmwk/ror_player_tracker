package com.playstats.mapping;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.playstats.crawler.RoRPlayer;
import com.playstats.model.Player;

@Service
public class RoRPlayer2PlayerMapper {

	public List<Player> map2PlayerList(List<RoRPlayer> rorPlayerList) {
		return rorPlayerList.stream().map(rorP -> map2Player(rorP)).collect(Collectors.toList());
	}

	public Player map2Player(RoRPlayer rorPlayer) {
		String name = extractName(rorPlayer);
		String careerLine = extractCareerLine(rorPlayer);
		String race = extractRace(rorPlayer);

		// @formatter:off
		Player p = new Player(
				rorPlayer.getCharacterId(), 
				name, 
				race,
				careerLine, 
				Integer.parseInt(rorPlayer.getSex()), 
				Integer.parseInt(rorPlayer.getLevel()), 
				Integer.parseInt(rorPlayer.getRenownRank()));
		// @formatter:on
		return p;
	}

	private String extractName(RoRPlayer rorPlayer) {
		int startIndex = rorPlayer.getName().indexOf('>');
		int endIndex = rorPlayer.getName().indexOf("</a>");
		return rorPlayer.getName().substring(startIndex + 1, endIndex);
	}

	private String extractCareerLine(RoRPlayer rorPlayer) {
		int startIndex = rorPlayer.getCareerLine().indexOf("title='");
		int endIndex = rorPlayer.getCareerLine().indexOf("'", startIndex + 7);
		return rorPlayer.getCareerLine().substring(startIndex + 7, endIndex);
	}

	private String extractRace(RoRPlayer rorPlayer) {
		int startIndex = rorPlayer.getRace().indexOf("title='");
		int endIndex = rorPlayer.getRace().indexOf("'", startIndex + 7);
		return rorPlayer.getRace().substring(startIndex + 7, endIndex);
	}
}
