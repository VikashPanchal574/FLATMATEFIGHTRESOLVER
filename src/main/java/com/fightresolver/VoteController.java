package com.fightresolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/complaints")
public class VoteController {

	@Autowired
	private VoteService voteService;
	
	@PostMapping("{id}/vote")
	public String vote(@PathVariable int id , @RequestBody Vote vote) {
		return voteService.vote(id, vote);
	}
	
	@GetMapping("{id}/upvote")
	public int getUpVote(@PathVariable int id) {
		return voteService.getUpvoteCount(id);
	}
	@GetMapping("{id}/downvote")
	public int getDownVote(@PathVariable int id) {
		return voteService.getDownvoteCount(id);
	}
	@GetMapping("{id}/votes")
	public List<Vote> getVote(@PathVariable int id){
		return voteService.getVoteByComplaintId(id);
	}
	
	
}
