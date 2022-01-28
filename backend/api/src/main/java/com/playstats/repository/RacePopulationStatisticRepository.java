package com.playstats.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.playstats.model.statistics.RacePopulationStatistic;

@Repository
public interface RacePopulationStatisticRepository extends CrudRepository<RacePopulationStatistic, Long> {

}
