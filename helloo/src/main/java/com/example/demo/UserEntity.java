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
@Entity(name = "user")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "sex")
	private char sex;
	
	@Column(name = "email")
	private String email;

	@Builder
	public UserEntity (Integer id, String name, String password, char sex, String email) { 
		this.id = id; 		
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.email = email;
		}

}
