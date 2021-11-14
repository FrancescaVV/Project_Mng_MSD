package org.app.domain;

import java.util.Date;

public class Notification {
	private Date dateNotif;
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
