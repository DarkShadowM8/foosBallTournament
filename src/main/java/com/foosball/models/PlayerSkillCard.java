package com.foosball.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.foosball.enumerations.PlayStyle;

@Entity
public class PlayerSkillCard {
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//											FIELDS
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private PlayStyle style;
	
	private Integer totalPlayedMatches;
	private Integer totalWins;
	private Double winPercentage;
	private Integer winStreak;
	
	@OneToOne (mappedBy = "playerSkills")
	private Player player;

//////////////////////////////////////////////////////////////////////////////////////////////////
//										GETTERS & SETTERS
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Integer getTotalPlayedMatches() {
		return totalPlayedMatches;
	}

	public void setTotalPlayedMatches(Integer totalPlayedMatches) {
		this.totalPlayedMatches = totalPlayedMatches;
	}

	public Integer getTotalWins() {
		return totalWins;
	}

	public void setTotalWins(Integer totalWins) {
		this.totalWins = totalWins;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PlayStyle getStyle() {
		return style;
	}

	public void setStyle(PlayStyle style) {
		this.style = style;
	}

	public Double getWinPercentage() {
		return winPercentage;
	}

	public void setWinPercentage(Double winPercentage) {
		//this.winPercentage = (double) ((totalWins / totalPlayedMatches) * 100);
		this.winPercentage = winPercentage;
	}

	public Integer getWinStreak() {
		return winStreak;
	}

	public void setWinStreak(Integer winStreak) {
		this.winStreak = winStreak;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
}
