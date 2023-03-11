package com.foosball.modelsDTO;

import com.foosball.enumerations.PlayStyle;

public class PlayerSkillCardDto {

//////////////////////////////////////////////////////////////////////////////////////////////////
//										ATTRIBUTES
//////////////////////////////////////////////////////////////////////////////////////////////////

	private Long id;
	private PlayStyle style;
	private Integer totalWins, totalPlayedMatches;
	private Double winPercentage;
	private Integer winStreak;
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//										GETTERS & SETTERS
//////////////////////////////////////////////////////////////////////////////////////////////////

	public Integer getTotalWins() {
		return totalWins;
	}
	public void setTotalWins(Integer totalWins) {
		this.totalWins = totalWins;
	}
	public Integer getTotalPlayedMatches() {
		return totalPlayedMatches;
	}
	public void setTotalPlayedMatches(Integer totalPlayedMatches) {
		this.totalPlayedMatches = totalPlayedMatches;
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
		this.winPercentage = winPercentage;
	}
	public Integer getWinStreak() {
		return winStreak;
	}
	public void setWinStreak(Integer winStreak) {
		this.winStreak = winStreak;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//											ToString METHOD
//////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public String toString() {
		return "PlayerSkillCardDto [id=" + id + ", style=" + style + ", totalWins=" + totalWins
				+ ", totalPlayedMatches=" + totalPlayedMatches + ", winPercentage=" + winPercentage + ", winStreak="
				+ winStreak + "]";
	}
	
}