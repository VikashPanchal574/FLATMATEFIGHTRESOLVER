package com.fightresolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteService {

	@Autowired
	private VoteRepository voteRepository ;
	
	public String vote(int complaintId , Vote vote) {
		
		vote.setComplaintId(complaintId);
		voteRepository.save(vote);
		return String.format("Vote recoreded %s", vote.isUpvote()? "Upvote" : "Dpwnvote");
		
	}
	
	public int getUpvoteCount(int complaintId) {
		return voteRepository.countByComplaintIdAndIsUpvote(complaintId, true);
	}
	
	public int getDownvoteCount(int complaintId) {
		return voteRepository.countByComplaintIdAndIsUpvote(complaintId, false);
	}
	
	public List<Vote> getVoteByComplaintId(int complaintId){
		return voteRepository.findByComplaintId(complaintId);
	}
}
