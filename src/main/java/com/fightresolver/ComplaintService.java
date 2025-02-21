package com.fightresolver;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplaintService {
	
	@Autowired
	private ComplaintRepository complaintRepository ;
	
	public Complaint addComplaint(Complaint complaint) {
		complaint.setTime(java.time.LocalDateTime.now());
		return complaintRepository.save(complaint);
	}
	
	public List<Complaint> getAllComplaints(){
		return StreamSupport.stream(complaintRepository.findAll().spliterator(), false).filter(c -> !c.isResolved()).collect(Collectors.toList());
	}
	
	public String resolvedComplaint(int id) {
		return complaintRepository.findById(id).map(complaint -> {complaint.setResolved(true); complaintRepository.save(complaint);
		return "Complaint ID " +id+" resolved";}).orElse("Complaint ID " +id+" not found");
	}

}
