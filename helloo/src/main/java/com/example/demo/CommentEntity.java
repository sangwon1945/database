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
@Entity(name = "comment")
public class CommentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "scheduler_id")
	private Integer scheduler_id;
	
	@Column(name = "user_id")
	private Integer user_id;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "date")
	private Date date;
		
	@Builder
	public CommentEntity (Integer id, Integer scheduler_id, Integer user_id, String content, Date date) { 
		this.id = id; 
		this.scheduler_id = scheduler_id;
		this.user_id = user_id;
		this.content = content;
		this.date = date;		
		}

}
