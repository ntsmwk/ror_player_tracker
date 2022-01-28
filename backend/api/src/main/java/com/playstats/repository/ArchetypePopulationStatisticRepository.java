package com.playstats.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.playstats.model.statistics.ArchetypePopulationStatistic;

@Repository
public interface ArchetypePopulationStatisticRepository extends CrudRepository<ArchetypePopulationStatistic, Long> {

}
