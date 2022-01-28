package com.playstats.crawler;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoRPlayer {

	@JsonProperty("CharacterId") private String CharacterId;
	@JsonProperty("Name") private String Name;
	@JsonProperty("RealmId") private String RealmId;
	@JsonProperty("CareerLine") private String CareerLine;
	@JsonProperty("Race") private String Race;
	@JsonProperty("Sex") private String Sex;
	@JsonProperty("Level") private String Level;
	@JsonProperty("RenownRank") private String RenownRank;

	public RoRPlayer() {
		// TODO Auto-generated constructor stub
	}

	public String getCharacterId() {
		return CharacterId;
	}

	public void setCharacterId(String characterId) {
		CharacterId = characterId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRealmId() {
		return RealmId;
	}

	public void setRealmId(String realmId) {
		RealmId = realmId;
	}

	public String getCareerLine() {
		return CareerLine;
	}

	public void setCareerLine(String careerLine) {
		CareerLine = careerLine;
	}

	public String getRace() {
		return Race;
	}

	public void setRace(String race) {
		Race = race;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getLevel() {
		return Level;
	}

	public void setLevel(String level) {
		Level = level;
	}

	public String getRenownRank() {
		return RenownRank;
	}

	public void setRenownRank(String renownRank) {
		RenownRank = renownRank;
	}

}
