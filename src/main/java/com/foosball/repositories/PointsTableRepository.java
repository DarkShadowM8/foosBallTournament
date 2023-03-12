package com.foosball.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foosball.models.PointsTable;

public interface PointsTableRepository extends JpaRepository<PointsTable, Long>{
	PointsTable findByTournamentIdAndTeamName(Long tournamentId, String teamName);
}
