package com.foosball.services.interfaces;

import java.util.List;

import com.foosball.models.Match;
import com.foosball.models.PointsTable;
import com.foosball.models.Team;

public interface PointsTableService {
	public List<PointsTable> getPointsTable();
	public void pointsUpdate(Team team_1, Team team_2, Long tournament_ID, Match match);
}
