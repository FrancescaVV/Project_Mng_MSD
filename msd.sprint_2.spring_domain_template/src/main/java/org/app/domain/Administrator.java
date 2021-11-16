package org.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Administrator extends Person {
	private String adminDepartment;
	@Id @GeneratedValue
	private Integer adminId;
	private String adminTitle;
	
	public String getAdminDepartment() {
		return adminDepartment;
	}
	public void setAdminDepartment(String adminDepartment) {
		this.adminDepartment = adminDepartment;
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getAdminTitle() {
		return adminTitle;
	}
	public void setAdminTitle(String adminTitle) {
		this.adminTitle = adminTitle;
	}
	
}
