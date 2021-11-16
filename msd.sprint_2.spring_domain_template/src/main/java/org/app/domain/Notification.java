package org.app.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Notification {
	private Date dateNotif;
	@Id @GeneratedValue
	private Integer idNotif;
	private String txtNotif;
	public Date getDateNotif() {
		return dateNotif;
	}
	public void setDateNotif(Date dateNotif) {
		this.dateNotif = dateNotif;
	}
	public Integer getIdNotif() {
		return idNotif;
	}
	public void setIdNotif(Integer idNotif) {
		this.idNotif = idNotif;
	}
	public String getTxtNotif() {
		return txtNotif;
	}
	public void setTxtNotif(String txtNotif) {
		this.txtNotif = txtNotif;
	}
	
	
}
