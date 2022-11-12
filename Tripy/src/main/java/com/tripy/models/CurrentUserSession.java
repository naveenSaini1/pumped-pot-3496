package com.tripy.models;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;


//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
@Entity
public class CurrentUserSession{

	@Id
	@Column(unique=true)
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String key;
	private LocalDateTime localDateTime;
	
	
	
	@Override
	public String toString() {
		return "CurrentUserSession [userId=" + userId + ", key=" + key + ", localDateTime=" + localDateTime + "]";
	}
	public CurrentUserSession() {
		// TODO Auto-generated constructor stub
	}
	public CurrentUserSession(Integer userId, String key, LocalDateTime localDateTime) {
		super();
		this.userId = userId;
		this.key = key;
		this.localDateTime = localDateTime;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	
}
