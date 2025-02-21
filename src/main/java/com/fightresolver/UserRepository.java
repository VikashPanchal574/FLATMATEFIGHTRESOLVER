package com.fightresolver;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
	List<User> findByFlatCode(String flatCode);
	List<User> findTop5ByOrderByKarmaPointsDesc();

}
