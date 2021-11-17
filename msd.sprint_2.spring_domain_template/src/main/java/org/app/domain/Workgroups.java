package org.app.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Workgroups {

	@Id @GeneratedValue @NotNull
	private Integer wrkID;

	@OneToMany
	private ArrayList<Student> wkrList = new ArrayList<Student>();

	@NotNull(message = "Workgroup Name is required!")
	@Size(min=1, message = "Workgroup Name must have an explicit name!")
	private String wkrName;

	@OneToOne @NotNull
	private Professor mentor;
	public Integer getWrkID() {
		return wrkID;
	}
	public void setWrkID(Integer wrkID) {
		this.wrkID = wrkID;
	}
	public ArrayList<Student> getWkrList() {
		return wkrList;
	}
	public void setWkrList(ArrayList<Student> wkrList) {
		this.wkrList = wkrList;
	}
	public String getWkrName() {
		return wkrName;
	}
	public void setWkrName(String wkrName) {
		this.wkrName = wkrName;
	}
	public Professor getMentor() {
		return mentor;
	}
	public void setMentor(Professor mentor) {
		this.mentor = mentor;
	}
	
}
