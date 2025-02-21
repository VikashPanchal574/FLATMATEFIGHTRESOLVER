package com.fightresolver;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ComplaintRepository extends CrudRepository<Complaint, Integer>{
	List<Complaint> findByResolvedFalse();

	
}
