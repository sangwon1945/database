package com.example.demo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoGroupResponse {

	private Integer id;
	private Integer project_id;
	private Integer user_id;


	
	public DtoGroupResponse (GroupEntity groupentity) { 
		this.id = groupentity.getId(); 
		this.project_id = groupentity.getProject_id();
		this.user_id = groupentity.getUser_id();
		}
}