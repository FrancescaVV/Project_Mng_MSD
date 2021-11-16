package org.app.services;

import java.util.*;

import org.app.domain.Meetings;

public interface IManageMeetings {

	public Meetings createMeet(String meetingTopic);
	public void deleteMeet();
	public Meetings modifyMeet(String meetingTopic);
}
