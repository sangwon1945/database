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
@Setter
public class DtoScheduler {
	
	private Integer id; 
	private Integer user_id;
	private Integer project_id;
	private String content;
	private String title;
	private String roll;
	private Date due_date;

}
