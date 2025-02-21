package com.fightresolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		return ResponseEntity.ok(userService.register(user));

	}
	@GetMapping("/{flatCode}")
	public ResponseEntity<List<User>> getUser(@PathVariable String flatCode){
		return ResponseEntity.ok(userService.getUserByFlat(flatCode));
		
	}
	
	@PutMapping("/{id}/increase-karma")
	public User increaseKarma(@PathVariable int id) {
		return userService.increaseKarma(id);
	}
	
	@GetMapping("/leaderboard")
	public List<User> getLeaderboard(){
		return userService.getLeaderboard();
	}
}
