package com.foosball.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foosball.enumerations.PlayerStatus;
import com.foosball.models.Player;
import com.foosball.models.PlayerSkillCard;
import com.foosball.models.Team;

public interface PlayerRepository extends JpaRepository<Player, Long>{

//////////////////////////////////////////////////////////////////////////////////////////////////
//								CUSTOM QUERIES REPOSITORY METHODS
//////////////////////////////////////////////////////////////////////////////////////////////////

	List<Player> findByFirstName(String firstName);
	List<Player> findByLastName(String lastName);
	List<Player> findByCnic(Integer cnic);
	List<Player> findByStatus(PlayerStatus status);
	List<Player> findByTeam(Team team);
	List<Player> findByStatusAndTeam_Name(PlayerStatus status, String teamName);
}
