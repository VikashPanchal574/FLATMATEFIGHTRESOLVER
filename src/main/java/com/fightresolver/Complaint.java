package com.fightresolver;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Complaint {

	@Id
	@GeneratedValue
	private int id;
	private String tittle;
	
	private String description;
	private String type;
	private String severity;
	private LocalDateTime time;
	//@Column(columnDefinition = "TINYINT(1)")
	private boolean resolved = false;
	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Complaint(int id, String description, String type, String severity, LocalDateTime time, boolean resolved, String tittle) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.description = description;
		this.type = type;
		this.severity = severity;
		this.time = time;
		this.resolved = resolved;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public boolean isResolved() {
		return resolved;
	}
	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	
	
	
	
}
