package com.example.demo;

import lombok.*;
import java.util.Date;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
@Entity(name = "project")
@NoArgsConstructor

@Getter
public class ProjectEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "title")
	private String title;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "due_date")
	private Date due_date;
	
	@Column(name = "meeting")
	private Date meeting;
	
	@Column(name = "manager")
	private String manager;

	public ProjectEntity (DtoProject dtoproject) { 
		this.title = dtoproject.getTitle();
		this.content = dtoproject.getContent();
		this.due_date = dtoproject.getDue_date();
		this.meeting = dtoproject.getMeeting();
		this.manager = dtoproject.getManager();
		}

}
