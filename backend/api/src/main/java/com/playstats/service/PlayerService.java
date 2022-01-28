package com.playstats.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playstats.repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired private PlayerRepository playerRepository;

}