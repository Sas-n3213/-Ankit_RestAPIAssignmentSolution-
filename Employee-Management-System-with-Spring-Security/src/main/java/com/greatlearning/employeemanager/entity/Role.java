package com.greatlearning.employeemanager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleId;
	private String name;

	public Role() {
		super();
		this.name = name;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
}