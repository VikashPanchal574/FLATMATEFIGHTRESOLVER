package com.fightresolver;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote, Integer> {
   int countByComplaintIdAndIsUpvote(int complaintId , boolean isUpvote);
   List<Vote> findByComplaintId(int complaintId);
}
