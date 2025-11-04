package com.projetopessoal_02.list.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetopessoal_02.list.dto.GameMinDto;
import com.projetopessoal_02.list.entities.Game;
import com.projetopessoal_02.list.repositories.GameRepository;

@Service // ou @Component
public class GameService {
	
	@Autowired // resolve a dependência
	private GameRepository gameRepository; // injetando componente
	
	
	public List<GameMinDto> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream()
				.map(x -> new GameMinDto(x)).toList();

	}
	
	

}
