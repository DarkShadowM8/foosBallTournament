package com.foosball.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foosball.models.Tournament;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {

	Optional<Tournament> findById(Long tournament);

}
