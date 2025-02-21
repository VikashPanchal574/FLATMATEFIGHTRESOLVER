package com.fightresolver;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/complaints")
public class ComplaintController {

	@Autowired
	ComplaintService complaintService;
	
	@Autowired
	private ComplaintRepository complaintRepository;
	
	@PostMapping
	public Complaint addComplaint(@RequestBody Complaint complaint) {
		return complaintService.addComplaint(complaint);
	}
    
	@GetMapping
	public List<Complaint> getAllComplaint(){
		return complaintService.getAllComplaints();
	}
	
	@PutMapping("{id}/resolve")
	public String resolvedComplaint(@PathVariable int id) {
		return complaintService.resolvedComplaint(id);
	}
	
	@GetMapping("/all")
	public List<Complaint> getAllComplaints(){
		return StreamSupport.stream(complaintRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}
}
