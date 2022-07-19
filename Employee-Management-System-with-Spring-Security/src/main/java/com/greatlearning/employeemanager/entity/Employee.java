package com.greatlearning.employeemanager.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
	@Id
	private long employeeId;
	private String firstName;
	private String lastName;
	private String email;
	public void setFirstName(String firstName2) {
		// TODO Auto-generated method stub
		
	}
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getLastName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setEmail(Object email2) {
		// TODO Auto-generated method stub
		
	}
	public void setLastName(Object lastName2) {
		// TODO Auto-generated method stub
		
	}
}