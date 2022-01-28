package com.playstats.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.playstats.model.statistics.CareerPopulationStatistic;

@Repository
public interface CareerPopulationStatisticRepository extends CrudRepository<CareerPopulationStatistic, Long> {

}
