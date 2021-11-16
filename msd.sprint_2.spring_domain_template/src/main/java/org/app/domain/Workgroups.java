package org.app.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Workgroups {
	@Id @GeneratedValue
	private Integer wrkID;
	@OneToMany
	private ArrayList<Student> wkrList = new ArrayList<Student>();
	private String wkrName;
	@OneToOne
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
