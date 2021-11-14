package org.app.domain.assignment;

import java.util.ArrayList;

import org.app.domain.users.Professor;
import org.app.domain.users.Student;

public class Workgroups {
	private Integer wrkID;
	private ArrayList<Student> wkrList = new ArrayList<Student>();
	private String wkrName;
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
