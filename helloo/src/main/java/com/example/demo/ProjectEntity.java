package com.example.demo;

import lombok.*;
import java.util.Date;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "project")
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

	@Builder
	public ProjectEntity (Integer id, String title, String content, Date due_date, Date meeting, String manager) { 
		this.id = id; 
		this.title = title;
		this.content = content;
		this.due_date = due_date;
		this.meeting = meeting;
		this.manager = manager;
		}

}
