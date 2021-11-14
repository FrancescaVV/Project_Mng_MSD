package org.app.domain;

public class Administrator extends Person {
	private String adminDepartment;
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
