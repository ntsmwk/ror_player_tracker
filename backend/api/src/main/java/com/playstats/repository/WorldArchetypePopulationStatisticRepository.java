package com.playstats.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.playstats.model.statistics.WorldArchetypePopulationStatistic;

@Repository
public interface WorldArchetypePopulationStatisticRepository
		extends CrudRepository<WorldArchetypePopulationStatistic, Long> {

}
