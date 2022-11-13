package com.tripy.models;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrentUserSession{

	@Id
	@Column(unique = true)
	private Integer userId;
	private String ukey;
	private LocalDateTime localDateTime;

	public CurrentUserSession() {
		// TODO Auto-generated constructor stub
	}

	public CurrentUserSession(Integer userId, String ukey, LocalDateTime localDateTime) {
		super();
		this.userId = userId;
		this.ukey = ukey;
		this.localDateTime = localDateTime;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUkey() {
		return ukey;
	}

	public void setUkey(String ukey) {
		this.ukey = ukey;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	@Override
	public String toString() {
		return "CurrentUserSession [userId=" + userId + ", ukey=" + ukey + ", localDateTime=" + localDateTime + "]";
	}
	
	
}
