package com.playstats.model.statistics;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "career_population_statistic")
public class CareerPopulationStatistic {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) private Long id;

	private Date date;
//	Greenskin
	private int blackOrcPopulation;
	private int choppaPopulation;
	private int squigHerderPopulation;
	private int shamanPopulation;
//	Dark Elf
	private int blackGuardPopulation;
	private int witchElfPopulation;
	private int sorcererPopulation;
	private int discipleOfKhainePopulation;
//	Chaos
	private int chosenPopulation;
	private int marauderPopulation;
	private int magusPopulation;
	private int zealotPopulation;
//	Dwarf
	private int ironbreakerPopulation;
	private int slayerPopulation;
	private int engineerPopulation;
	private int runePriestPopulation;
//	High Elf
	private int swordmasterPopulation;
	private int whiteLionPopulation;
	private int shadowWarriorPopulation;
	private int archmagePopulation;
//	Empire
	private int knightPopulation;
	private int witchHunterPopulation;
	private int brightWizardPopulation;
	private int warriorPriestPopulation;

	private int totalNumber;

	public CareerPopulationStatistic() {
	}

	public CareerPopulationStatistic(Date date, int totalNumber) {
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

	public int getBlackOrcPopulation() {
		return blackOrcPopulation;
	}

	public void setBlackOrcPopulation(int blackOrcPopulation) {
		this.blackOrcPopulation = blackOrcPopulation;
	}

	public void incBlackOrcPopulation() {
		this.blackOrcPopulation++;
	}

	public int getChoppaPopulation() {
		return choppaPopulation;
	}

	public void setChoppaPopulation(int choppaPopulation) {
		this.choppaPopulation = choppaPopulation;
	}

	public void incChoppaPopulation() {
		this.choppaPopulation++;
	}

	public int getSquigHerderPopulation() {
		return squigHerderPopulation;
	}

	public void setSquigHerderPopulation(int squigHerderPopulation) {
		this.squigHerderPopulation = squigHerderPopulation;
	}

	public void incSquigHerderPopulation() {
		this.squigHerderPopulation++;
	}

	public int getShamanPopulation() {
		return shamanPopulation;
	}

	public void setShamanPopulation(int shamanPopulation) {
		this.shamanPopulation = shamanPopulation;
	}

	public void incShamanPopulation() {
		this.shamanPopulation++;
	}

	public int getBlackGuardPopulation() {
		return blackGuardPopulation;
	}

	public void setBlackGuardPopulation(int blackGuardPopulation) {
		this.blackGuardPopulation = blackGuardPopulation;
	}

	public void incBlackGuardPopulation() {
		this.blackGuardPopulation++;
	}

	public int getWitchElfPopulation() {
		return witchElfPopulation;
	}

	public void setWitchElfPopulation(int witchElfPopulation) {
		this.witchElfPopulation = witchElfPopulation;
	}

	public void incWitchElfPopulation() {
		this.witchElfPopulation++;
	}

	public int getSorcererPopulation() {
		return sorcererPopulation;
	}

	public void setSorcererPopulation(int sorcererPopulation) {
		this.sorcererPopulation = sorcererPopulation;
	}

	public void incSorcererPopulation() {
		this.sorcererPopulation++;
	}

	public int getDiscipleOfKhainePopulation() {
		return discipleOfKhainePopulation;
	}

	public void setDiscipleOfKhainePopulation(int discipleOfKhainePopulation) {
		this.discipleOfKhainePopulation = discipleOfKhainePopulation;
	}

	public void incDiscipleOfKhainePopulation() {
		this.discipleOfKhainePopulation++;
	}

	public int getChosenPopulation() {
		return chosenPopulation;
	}

	public void setChosenPopulation(int chosenPopulation) {
		this.chosenPopulation = chosenPopulation;
	}

	public void incChosenPopulation() {
		this.chosenPopulation++;
	}

	public int getMarauderPopulation() {
		return marauderPopulation;
	}

	public void setMarauderPopulation(int marauderPopulation) {
		this.marauderPopulation = marauderPopulation;
	}

	public void incMarauderPopulation() {
		this.marauderPopulation++;
	}

	public int getMagusPopulation() {
		return magusPopulation;
	}

	public void setMagusPopulation(int magusPopulation) {
		this.magusPopulation = magusPopulation;
	}

	public void incMagusPopulation() {
		this.magusPopulation++;
	}

	public int getZealotPopulation() {
		return zealotPopulation;
	}

	public void setZealotPopulation(int zealotPopulation) {
		this.zealotPopulation = zealotPopulation;
	}

	public void incZealotPopulation() {
		this.zealotPopulation++;
	}

	public int getIronbreakerPopulation() {
		return ironbreakerPopulation;
	}

	public void setIronbreakerPopulation(int ironbreakerPopulation) {
		this.ironbreakerPopulation = ironbreakerPopulation;
	}

	public void incIronbreakerPopulation() {
		this.ironbreakerPopulation++;
	}

	public int getSlayerPopulation() {
		return slayerPopulation;
	}

	public void setSlayerPopulation(int slayerPopulation) {
		this.slayerPopulation = slayerPopulation;
	}

	public void incSlayerPopulation() {
		this.slayerPopulation++;
	}

	public int getEngineerPopulation() {
		return engineerPopulation;
	}

	public void setEngineerPopulation(int engineerPopulation) {
		this.engineerPopulation = engineerPopulation;
	}

	public void incEngineerPopulation() {
		this.engineerPopulation++;
	}

	public int getRunePriestPopulation() {
		return runePriestPopulation;
	}

	public void setRunePriestPopulation(int runePriestPopulation) {
		this.runePriestPopulation = runePriestPopulation;
	}

	public void incRunePriestPopulation() {
		this.runePriestPopulation++;
	}

	public int getSwordmasterPopulation() {
		return swordmasterPopulation;
	}

	public void setSwordmasterPopulation(int swordmasterPopulation) {
		this.swordmasterPopulation = swordmasterPopulation;
	}

	public void incSwordmasterPopulation() {
		this.swordmasterPopulation++;
	}

	public int getWhiteLionPopulation() {
		return whiteLionPopulation;
	}

	public void setWhiteLionPopulation(int whiteLionPopulation) {
		this.whiteLionPopulation = whiteLionPopulation;
	}

	public void incWhiteLionPopulation() {
		this.whiteLionPopulation++;
	}

	public int getShadowWarriorPopulation() {
		return shadowWarriorPopulation;
	}

	public void setShadowWarriorPopulation(int shadowWarriorPopulation) {
		this.shadowWarriorPopulation = shadowWarriorPopulation;
	}

	public void incShadowWarriorPopulation() {
		this.shadowWarriorPopulation++;
	}

	public int getArchmagePopulation() {
		return archmagePopulation;
	}

	public void setArchmagePopulation(int archmagePopulation) {
		this.archmagePopulation = archmagePopulation;
	}

	public void incArchmagePopulation() {
		this.archmagePopulation++;
	}

	public int getKnightPopulation() {
		return knightPopulation;
	}

	public void setKnightPopulation(int knightPopulation) {
		this.knightPopulation = knightPopulation;
	}

	public void incKnightPopulation() {
		this.knightPopulation++;
	}

	public int getWitchHunterPopulation() {
		return witchHunterPopulation;
	}

	public void setWitchHunterPopulation(int witchHunterPopulation) {
		this.witchHunterPopulation = witchHunterPopulation;
	}

	public void incWitchHunterPopulation() {
		this.witchHunterPopulation++;
	}

	public int getBrightWizardPopulation() {
		return brightWizardPopulation;
	}

	public void setBrightWizardPopulation(int brightWizardPopulation) {
		this.brightWizardPopulation = brightWizardPopulation;
	}

	public void incBrightWizardPopulation() {
		this.brightWizardPopulation++;
	}

	public int getWarriorPriestPopulation() {
		return warriorPriestPopulation;
	}

	public void setWarriorPriestPopulation(int warriorPriestPopulation) {
		this.warriorPriestPopulation = warriorPriestPopulation;
	}

	public void incWarriorPriestPopulation() {
		this.warriorPriestPopulation++;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

}
