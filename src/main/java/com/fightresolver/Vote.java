package com.fightresolver;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Vote {
	@Id
	@GeneratedValue
	private int id;
	private int complaintId;
	private int userId;
	@Column(columnDefinition = "BOOLEAN")
	private boolean isUpvote;
	
	public int getId() {
	    return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public boolean isUpvote() {
		return isUpvote;
	}
	public void setUpvote(boolean isUpvote) {
		this.isUpvote = isUpvote;
	}
	public Vote(int id, int complaintId, boolean isUpvote, int userId) {
		super();
		this.id = id;
		this.complaintId = complaintId;
		this.isUpvote = isUpvote;
		this.userId = userId;
	}
	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
