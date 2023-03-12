package com.foosball.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foosball.models.Match;
import com.foosball.models.PointsTable;
import com.foosball.models.Team;
import com.foosball.models.Tournament;
import com.foosball.repositories.PointsTableRepository;
import com.foosball.services.interfaces.PointsTableService;

@Service
public class PointsTableServiceImpl implements PointsTableService{
	
	@Autowired
	PointsTableRepository pointsTableRepo;
	
	public List<PointsTable> getPointsTable(){
		List<PointsTable> pointsTable = pointsTableRepo.findAll();
		return pointsTable;
	}
	
	public void pointsUpdate(Team winner, Team loser, Long tournament_ID, Match match) {
		
		PointsTable team_1_points = pointsTableRepo.findByTournamentIdAndTeamName(tournament_ID, winner.getName());
		team_1_points.setToatlPlayedMatch(team_1_points.getToatlPlayedMatch() + 1);
		team_1_points.setWin(team_1_points.getWin() + 1);
		team_1_points.setPoints(team_1_points.getPoints() + match.getRoundsWinByTeam_1() * 2);

		PointsTable team_2_points = pointsTableRepo.findByTournamentIdAndTeamName(tournament_ID, loser.getName());
		team_2_points.setToatlPlayedMatch(team_2_points.getToatlPlayedMatch() + 1);
		team_2_points.setWin(team_2_points.getLoss() + 1);
		team_2_points.setPoints(team_2_points.getPoints() + match.getRoundsWinByTeam_1());
		
	}
}
