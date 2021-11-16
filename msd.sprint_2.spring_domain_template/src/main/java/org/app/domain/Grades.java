package org.app.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Grades {

	private Date gradeDate;
	private Double gradeValue;
	@Id @GeneratedValue
	private Integer gradeId;
	public Date getGradeDate() {
		return gradeDate;
	}
	public void setGradeDate(Date gradeDate) {
		this.gradeDate = gradeDate;
	}
	public Double getGradeValue() {
		return gradeValue;
	}
	public void setGradeValue(Double gradeValue) {
		this.gradeValue = gradeValue;
	}
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	
	
}
