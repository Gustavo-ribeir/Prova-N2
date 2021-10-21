package br.com.gustavoribeiro.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gustavoribeiro.model.Game;
import br.com.gustavoribeiro.repository.GameRepository;



@Service
public class GameService {
	    @Autowired
	    private GameRepository gameRepository;

	    public Game insert(Game game) {
	        return gameRepository.save(game);
	    }

	    public Game update(Game objGame) {
	        return gameRepository.save(objGame);
	    }

	    public List<Game> findAll() {
	        List<Game> games = new ArrayList<>();
	        gameRepository.findAll().forEach(games::add);
	        return games;
	    }

	    public Optional<Game> findOne(Integer id) {
	        return gameRepository.findById(id);
	    }

	    public void remove(Integer id) {
	        gameRepository.deleteById(id);
	    }
	}

