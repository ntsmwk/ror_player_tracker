package com.playstats.model.statistics;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "world_population_statistic")
public class WorldPopulationStatistic {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) private Long id;

	private Date date;
	private int orderPopulation;
	private int destructionPopulation;
	private int totalNumber;

	public WorldPopulationStatistic() {
	}

	public WorldPopulationStatistic(Date date, int totalNumber) {
		this.date = date;
		this.totalNumber = totalNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getOrderPopulation() {
		return orderPopulation;
	}

	public void setOrderPopulation(int orderPopulation) {
		this.orderPopulation = orderPopulation;
	}

	public void incOrderPopulation() {
		this.orderPopulation++;
	}

	public int getDestructionPopulation() {
		return destructionPopulation;
	}

	public void setDestructionPopulation(int destructionPopulation) {
		this.destructionPopulation = destructionPopulation;
	}

	public void incDestructionPopulation() {
		this.destructionPopulation++;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

}
