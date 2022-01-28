package com.playstats.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.playstats.model.statistics.WorldPopulationStatistic;

@Repository
public interface WorldPopulationStatisticRepository extends CrudRepository<WorldPopulationStatistic, Long> {

}
