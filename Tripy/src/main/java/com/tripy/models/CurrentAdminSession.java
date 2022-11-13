package com.tripy.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
public class CurrentAdminSession {
	
	@Id
	@Column(unique = true)
	private Integer adminId;
	
	private String adId;
	private LocalDateTime localDateTime;
	
	public CurrentAdminSession() {
		
	}

	public CurrentAdminSession(Integer adminId, String adId, LocalDateTime localDateTime) {
		super();
		this.adminId = adminId;
		this.adId = adId;
		this.localDateTime = localDateTime;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdId() {
		return adId;
	}

	public void setAdId(String adId) {
		this.adId = adId;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	@Override
	public String toString() {
		return "AdminCurrentSession [adminId=" + adminId + ", adId=" + adId + ", localDateTime=" + localDateTime + "]";
	}
	
}
