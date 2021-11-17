package org.app.domain;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Meetings {
	@Id @GeneratedValue @NotNull
	private long meetingId;

	@Size(min = 1, max = 1000)
	private String meetingBody;

	@NotNull @Future
	@Temporal(TemporalType.DATE)
	private Date meetingStartDate;

	@NotNull @Future
	@Temporal(TemporalType.DATE)
	private Date meetingEndDate;

	@ManyToMany
	private ArrayList<Student> meetingMembers = new ArrayList<Student>();

	@OneToOne
	private Professor mentor;
	private String meetingObs;
	private String meetingTopic;
	private MeetingState meetingState; 
	
	
	public String getMeetingBody() {
		return meetingBody;
	}
	public void setMeetingBody(String meetingBody) {
		this.meetingBody = meetingBody;
	}
	public Date getMeetingStartDate() {
		return meetingStartDate;
	}
	public void setMeetingStartDate(Date meetingStartDate) {
		this.meetingStartDate = meetingStartDate;
	}
	public Date getMeetingEndDate() {
		return meetingEndDate;
	}
	public void setMeetingEndDate(Date meetingEndDate) {
		this.meetingEndDate = meetingEndDate;
	}
	public ArrayList<Student> getAgMembers() {
		return meetingMembers;
	}
	public void setAgMembers(ArrayList<Student> agMembers) {
		this.meetingMembers = agMembers;
	}
	public Professor getMentor() {
		return mentor;
	}
	public void setMentor(Professor mentor) {
		this.mentor = mentor;
	}
	public String getMeetingObs() {
		return meetingObs;
	}
	public void setMeetingObs(String meetingObs) {
		this.meetingObs = meetingObs;
	}
	public String getMeetingTopic() {
		return meetingTopic;
	}
	public void setMeetingTopic(String meetingTopic) {
		this.meetingTopic = meetingTopic;
	}
	
	public ArrayList<Student> getMeetingMembers() {
		return meetingMembers;
	}
	public void setMeetingMembers(ArrayList<Student> meetingMembers) {
		this.meetingMembers = meetingMembers;
	}
	public MeetingState getMeeetingState() {
		return meetingState;
	}
	public void setMeeetingState(MeetingState meeetingState) {
		this.meetingState = meeetingState;
	}
	@Override
	public String toString() {
		return "Meetings [meetingId=" + meetingId + ", meetingBody=" + meetingBody + ", meetingStartDate="
				+ meetingStartDate + ", meetingEndDate=" + meetingEndDate + ", meetingMembers=" + meetingMembers
				+ ", mentor=" + mentor + ", meetingObs=" + meetingObs + ", meetingTopic=" + meetingTopic
				+ ", meetingState=" + meetingState + "]";
	}
	
	
	
}
