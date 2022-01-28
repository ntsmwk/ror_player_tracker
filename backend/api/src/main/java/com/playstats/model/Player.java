package com.playstats.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player {

	@Id private String characterId;
	private String name;
	private String race;
	private String careerLine;

	private int sex;
	private int level;
	private int renownRank;

	public Player() {
	}

	public Player(String characterId, String name, String race, String careerLine, int sex, int level, int renownRank) {
		super();
		this.characterId = characterId;
		this.name = name;
		this.race = race;
		this.careerLine = careerLine;
		this.sex = sex;
		this.level = level;
		this.renownRank = renownRank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getCareerLine() {
		return careerLine;
	}

	public void setCareerLine(String careerLine) {
		this.careerLine = careerLine;
	}

	public String getCharacterId() {
		return characterId;
	}

	public void setCharacterId(String characterId) {
		this.characterId = characterId;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getRenownRank() {
		return renownRank;
	}

	public void setRenownRank(int renownRank) {
		this.renownRank = renownRank;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

}
