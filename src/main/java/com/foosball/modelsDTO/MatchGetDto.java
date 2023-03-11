package com.foosball.modelsDTO;

public class MatchGetDto {
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//													Fields
//////////////////////////////////////////////////////////////////////////////////////////////////

	private Long id;
	private String name;
	private String team_1;
	private String team_2;
	private Integer roundsWinByTeam_1;
	private Integer roundsWinByTeam_2;
	private String toss;
	private String winner;
	private String location;
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//											GETTERS & SETTERS
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam_1() {
		return team_1;
	}
	public void setTeam_1(String team_1) {
		this.team_1 = team_1;
	}
	public String getTeam_2() {
		return team_2;
	}
	public void setTeam_2(String team_2) {
		this.team_2 = team_2;
	}
	public Integer getRoundsWinByTeam_1() {
		return roundsWinByTeam_1;
	}
	public void setRoundsWinByTeam_1(Integer roundsWinByTeam_1) {
		this.roundsWinByTeam_1 = roundsWinByTeam_1;
	}
	public Integer getRoundsWinByTeam_2() {
		return roundsWinByTeam_2;
	}
	public void setRoundsWinByTeam_2(Integer roundsWinByTeam_2) {
		this.roundsWinByTeam_2 = roundsWinByTeam_2;
	}
	public String getToss() {
		return toss;
	}
	public void setToss(String toss) {
		this.toss = toss;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

//////////////////////////////////////////////////////////////////////////////////////////////////
//												ToString Method
//////////////////////////////////////////////////////////////////////////////////////////////////

	
	public String toString() {
		return "MatchGetDto [id=" + id + ", name=" + name + ", team_1=" + team_1 + ", team_2=" + team_2
				+ ", roundsWinByTeam_1=" + roundsWinByTeam_1 + ", roundsWinByTeam_2=" + roundsWinByTeam_2 + ", toss="
				+ toss + ", winner=" + winner + ", location=" + location + "]";
	}
	
	
}
