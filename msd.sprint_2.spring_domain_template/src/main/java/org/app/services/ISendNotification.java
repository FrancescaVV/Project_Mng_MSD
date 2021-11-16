package org.app.services;

import org.app.domain.Notification;

public interface ISendNotification {

	public Notification sendAssigGrade(Double grade);
	public Notification sendTskAssigned();
	public Notification sendWrkCreated();
	public Notification sendWrkDeleted();
	public Notification sendWrkGrade(Double grade);
	
	}
