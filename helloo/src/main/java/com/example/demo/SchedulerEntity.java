package com.example.demo;

import lombok.*;
import java.util.Date;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name = "scheduler")
@NoArgsConstructor

@Getter
public class SchedulerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "user_id")
	private Integer user_id;
	
	@Column(name = "project_id")
	private Integer project_id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "roll")
	private String roll;
	
	@Column(name = "due_date")
	private Date due_date;
	@Builder
	public SchedulerEntity (DtoScheduler dtoscheduler) { 
		this.id = id; 
		this.title = title;
		this.content = content;
		this.due_date = due_date;
		this.user_id = user_id;
		this.roll = roll;
		this.project_id = project_id;
		}

}
