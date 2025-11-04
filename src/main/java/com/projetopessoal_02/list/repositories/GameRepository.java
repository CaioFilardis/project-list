package com.projetopessoal_02.list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetopessoal_02.list.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
