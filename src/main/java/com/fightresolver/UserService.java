package com.fightresolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User register(User user) {
		return userRepository.save(user);
	}

	public List<User> getUserByFlat(String flatCode) {
		return userRepository.findByFlatCode(flatCode);
	}
	
	public User increaseKarma(int userId) {
		return userRepository.findById(userId).map(user ->{
	    user.setKarmaPoints(user.getKarmaPoints()+10);
				return userRepository.save(user);
		}).orElseThrow(()-> new RuntimeException("User Not Found"));
	}
	
	public List<User> getLeaderboard(){
		return userRepository.findTop5ByOrderByKarmaPointsDesc();
	}

}
