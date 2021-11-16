package org.app.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Assignment {
	
	@Id @GeneratedValue
	private Integer assigID;
	private Date assigDatestart;
	private Date assigDateEnd;
	private String assigName;
	private Person assigStarter;
	private AssignmentState assigState;
	@ManyToMany
	private ArrayList<Student> assigMem = new ArrayList<Student>();
	public Integer getassigID() {
		return assigID;
	}
	public void setassigID(Integer assigID) {
		this.assigID = assigID;
	}
	public Date getassigDatestart() {
		return assigDatestart;
	}
	public void setassigDatestart(Date assigDatestart) {
		this.assigDatestart = assigDatestart;
	}
	public Date getassigDateEnd() {
		return assigDateEnd;
	}
	public void setassigDateEnd(Date assigDateEnd) {
		this.assigDateEnd = assigDateEnd;
	}
	public String getassigName() {
		return assigName;
	}
	public void setassigName(String assigName) {
		this.assigName = assigName;
	}
	public Person getassigStarter() {
		return assigStarter;
	}
	public void setassigStarter(Person assigStarter) {
		this.assigStarter = assigStarter;
	}
	public AssignmentState getassigState() {
		return assigState;
	}
	public void setassigState(AssignmentState assigState) {
		this.assigState = assigState;
	}
	public ArrayList<Student> getassigMem() {
		return assigMem;
	}
	public void setassigMem(ArrayList<Student> assigMem) {
		this.assigMem = assigMem;
	}
	@Override
	public String toString() {
		return "Assignment [assigID=" + assigID + ", assigDatestart=" + assigDatestart + ", assigDateEnd=" + assigDateEnd
				+ ", assigName=" + assigName + ", assigStarter=" + assigStarter + ", assigState=" + assigState + ", assigMem="
				+ assigMem + "]";
	}
	public Assignment(Integer assigID, Date assigDatestart, Date assigDateEnd, String assigName, Person assigStarter,
			AssignmentState assigState, ArrayList<Student> assigMem) {
		super();
		this.assigID = assigID;
		this.assigDatestart = assigDatestart;
		this.assigDateEnd = assigDateEnd;
		this.assigName = assigName;
		this.assigStarter = assigStarter;
		this.assigState = assigState;
		this.assigMem = assigMem;
	}
	
	public Assignment() {
	
	}
	@Override
	public int hashCode() {
		return Objects.hash(assigID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Assignment other = (Assignment) obj;
		return Objects.equals(assigID, other.assigID);
	}
	
	
}
