package com.playstats.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.playstats.model.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

}
