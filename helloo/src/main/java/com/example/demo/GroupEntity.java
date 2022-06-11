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
@Entity(name = "grouplist")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class GroupEntity {
	@Id
	
	@Column(name = "id")
	private Integer id;

	@Column(name = "user_id")
	private Integer user_id;
	
	@Column(name = "project_id")
	private Integer project_id;
		

	public GroupEntity (DtoGroup dtogroup) { 
		this.id = dtogroup.getId();
		this.user_id = dtogroup.getUser_id();
		this.project_id = dtogroup.getProject_id();
		
		}

}
