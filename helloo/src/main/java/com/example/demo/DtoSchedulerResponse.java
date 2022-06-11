package com.example.demo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoSchedulerResponse {

	private Integer id;
	private String title;
	private String content;
	private String roll;
	private Date due_date;
	private Integer user_id;
	private Integer project_id;

	
	public DtoSchedulerResponse (SchedulerEntity schedulerentity) { 
		this.id = schedulerentity.getId(); 
		this.title = schedulerentity.getTitle();
		this.content = schedulerentity.getContent();
		this.due_date = schedulerentity.getDue_date();
		this.user_id = schedulerentity.getUser_id();
		this.project_id = schedulerentity.getProject_id();
		}
}

/*
package com.example.demo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoProjectResponse {

	private Integer id;
	private String title;
	private String content;
	private Date due_date;
	private Date meeting; 
	private String manager;

	
	public DtoProjectResponse (ProjectEntity projectentity) { 
		this.id = projectentity.getId(); 
		this.title = projectentity.getTitle();
		this.content = projectentity.getContent();
		this.due_date = projectentity.getDue_date();
		this.meeting = projectentity.getMeeting();
		this.manager = projectentity.getManager();
		}
}


*/