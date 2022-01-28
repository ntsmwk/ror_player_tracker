package com.playstats.model.statistics;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "world_archetype_population_statistic")
public class WorldArchetypePopulationStatistic {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) private Long id;

	private Date date;

	private int orderTankPopulation;
	private int orderRDpsPopulation;
	private int orderMDpsPopulation;
	private int orderHealerPopulation;

	private int destructionTankPopulation;
	private int destructionRDpsPopulation;
	private int destructionMDpsPopulation;
	private int destructionHealerPopulation;

	private int totalNumber;

	public WorldArchetypePopulationStatistic() {
	}

	public WorldArchetypePopulationStatistic(Date date, int totalNumber) {
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

	public int getOrderTankPopulation() {
		return orderTankPopulation;
	}

	public void setOrderTankPopulation(int orderTankPopulation) {
		this.orderTankPopulation = orderTankPopulation;
	}

	public void incOrderTankPopulation() {
		this.orderTankPopulation++;
	}

	public int getOrderRDpsPopulation() {
		return orderRDpsPopulation;
	}

	public void setOrderRDpsPopulation(int orderRDpsPopulation) {
		this.orderRDpsPopulation = orderRDpsPopulation;
	}

	public void incOrderRDpsPopulation() {
		this.orderRDpsPopulation++;
	}

	public int getOrderMDpsPopulation() {
		return orderMDpsPopulation;
	}

	public void setOrderMDpsPopulation(int orderMDpsPopulation) {
		this.orderMDpsPopulation = orderMDpsPopulation;
	}

	public void incOrderMDpsPopulation() {
		this.orderMDpsPopulation++;
	}

	public int getOrderHealerPopulation() {
		return orderHealerPopulation;
	}

	public void setOrderHealerPopulation(int orderHealerPopulation) {
		this.orderHealerPopulation = orderHealerPopulation;
	}

	public void incOrderHealerPopulation() {
		this.orderHealerPopulation++;
	}

	public int getDestructionTankPopulation() {
		return destructionTankPopulation;
	}

	public void setDestructionTankPopulation(int destructionTankPopulation) {
		this.destructionTankPopulation = destructionTankPopulation;
	}

	public void incDestructionTankPopulation() {
		this.destructionTankPopulation++;
	}

	public int getDestructionRDpsPopulation() {
		return destructionRDpsPopulation;
	}

	public void setDestructionRDpsPopulation(int destructionRDpsPopulation) {
		this.destructionRDpsPopulation = destructionRDpsPopulation;
	}

	public void incDestructionRDpsPopulation() {
		this.destructionRDpsPopulation++;
	}

	public int getDestructionMDpsPopulation() {
		return destructionMDpsPopulation;
	}

	public void setDestructionMDpsPopulation(int destructionMDpsPopulation) {
		this.destructionMDpsPopulation = destructionMDpsPopulation;
	}

	public void incDestructionMDpsPopulation() {
		this.destructionMDpsPopulation++;
	}

	public int getDestructionHealerPopulation() {
		return destructionHealerPopulation;
	}

	public void setDestructionHealerPopulation(int destructionHealerPopulation) {
		this.destructionHealerPopulation = destructionHealerPopulation;
	}

	public void incDestructionHealerPopulation() {
		this.destructionHealerPopulation++;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

}