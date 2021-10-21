package br.com.gustavoribeiro.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.gustavoribeiro.model.Game;


@Repository
public interface GameRepository extends CrudRepository<Game,Integer>{

	Game save(Game objGame);

	Iterable<Game> findAll();

	Optional<Game> findById(Integer id);

	void deleteById(Integer id);
		
}
 