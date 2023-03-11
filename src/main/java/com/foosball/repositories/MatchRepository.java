package com.foosball.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foosball.models.Match;
import com.foosball.models.Team;

public interface MatchRepository extends JpaRepository<Match, Long>{
	Team findByName(String name);
}
