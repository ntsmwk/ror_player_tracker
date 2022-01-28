package com.playstats.model.statistics;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "archetype_population_statistic")
public class ArchetypePopulationStatistic {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) private Long id;

	private Date date;

	private int tankPopulation;
	private int rDpsPopulation;
	private int mDpsPopulation;
	private int healerPopulation;

	private int totalNumber;

	public ArchetypePopulationStatistic() {
	}

	public ArchetypePopulationStatistic(Date date, int totalNumber) {
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

	public int getTankPopulation() {
		return tankPopulation;
	}

	public void setTankPopulation(int tankPopulation) {
		this.tankPopulation = tankPopulation;
	}

	public void incTankPopulation() {
		this.tankPopulation++;
	}

	public int getrDpsPopulation() {
		return rDpsPopulation;
	}

	public void setrDpsPopulation(int rDpsPopulation) {
		this.rDpsPopulation = rDpsPopulation;
	}

	public void incrDpsPopulation() {
		this.rDpsPopulation++;
	}

	public int getmDpsPopulation() {
		return mDpsPopulation;
	}

	public void setmDpsPopulation(int mDpsPopulation) {
		this.mDpsPopulation = mDpsPopulation;
	}

	public void incmDpsPopulation() {
		this.mDpsPopulation++;
	}

	public int getHealerPopulation() {
		return healerPopulation;
	}

	public void setHealerPopulation(int healerPopulation) {
		this.healerPopulation = healerPopulation;
	}

	public void incHealerPopulation() {
		this.healerPopulation++;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

}
