package com.infogame.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infogame.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
