package com.playstats.model.statistics;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "race_population_statistic")
public class RacePopulationStatistic {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) private Long id;

	private Date date;
	private int greenskinPopulation;
	private int darkElfPopulation;
	private int chaosPopulation;
	private int dwarfPopulation;
	private int highElfPopulation;
	private int empirePopulation;

	private int totalNumber;

	public RacePopulationStatistic() {
	}

	public RacePopulationStatistic(Date date, int totalNumber) {
		this.date = date;
		this.totalNumber = totalNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getGreenskinPopulation() {
		return greenskinPopulation;
	}

	public void setGreenskinPopulation(int greenskinPopulation) {
		this.greenskinPopulation = greenskinPopulation;
	}

	public void incGreenskinPopulation() {
		this.greenskinPopulation++;
	}

	public int getDarkElfPopulation() {
		return darkElfPopulation;
	}

	public void setDarkElfPopulation(int darkElfPopulation) {
		this.darkElfPopulation = darkElfPopulation;
	}

	public void incDarkElfPopulation() {
		this.darkElfPopulation++;
	}

	public int getChaosPopulation() {
		return chaosPopulation;
	}

	public void setChaosPopulation(int chaosPopulation) {
		this.chaosPopulation = chaosPopulation;
	}

	public void incChaosPopulation() {
		this.chaosPopulation++;
	}

	public int getDwarfPopulation() {
		return dwarfPopulation;
	}

	public void setDwarfPopulation(int dwarfPopulation) {
		this.dwarfPopulation = dwarfPopulation;
	}

	public void incDwarfPopulation() {
		this.dwarfPopulation++;
	}

	public int getHighElfPopulation() {
		return highElfPopulation;
	}

	public void setHighElfPopulation(int highElfPopulation) {
		this.highElfPopulation = highElfPopulation;
	}

	public void incHighElfPopulation() {
		this.highElfPopulation++;
	}

	public int getEmpirePopulation() {
		return empirePopulation;
	}

	public void setEmpirePopulation(int empirePopulation) {
		this.empirePopulation = empirePopulation;
	}

	public void incEmpirePopulation() {
		this.empirePopulation++;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

}
