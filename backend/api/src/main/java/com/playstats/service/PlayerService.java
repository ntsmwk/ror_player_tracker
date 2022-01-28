package com.playstats.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playstats.repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired private PlayerRepository playerRepository;

//	@PostConstruct
//	public void test() {
//		Player p = new Player("asdf", "asdf", "asdf", "aasdf", 1, 1, 1);
//		playerRepository.save(p);
//		System.out.println("player inserted");
//	}

}
