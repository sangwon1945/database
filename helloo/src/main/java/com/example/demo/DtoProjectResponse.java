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
