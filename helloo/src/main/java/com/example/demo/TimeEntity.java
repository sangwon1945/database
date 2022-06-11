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
@Entity(name = "time")
public class TimeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "user_id")
	private Integer user_id;
	
	@Column(name = "project_id")
	private Integer project_id;
	
	@Column(name = "project_meeting_date")
	private Date project_meeting_date;
	
	@Column(name = "semina_date")
	private Date semina_date;
	
	@Column(name = "team_meeting_date")
	private Date team_meeting_date;

	@Builder
	public TimeEntity (Integer id, Integer user_id, Integer project_id, Date project_meeting_date, Date semina_date, Date team_meeting_date) { 
		this.id = id; 
		this.user_id = user_id;
		this.project_id = project_id;
		this.project_meeting_date = project_meeting_date;
		this.semina_date = semina_date;
		this.team_meeting_date = team_meeting_date;
		}

}
