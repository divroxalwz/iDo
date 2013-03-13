package com.example.ido.model;

import java.util.Date;
import java.util.List;

// A Model Class to reflect a Task
public class Task {
	
	// USER DEFINED STUFFS
	
	// Static variables to indicate priority level of the task
	public static int HIGH_PRIORITY = 3;
	public static int MEDIUM_PRIORITY = 2;
	public static int LOW_PRIORITY = 1;
	
	// Static variables to indicate completion status
	public static boolean TASK_COMPLETED = true;
	public static boolean TASK_NOT_COMPLETED = false;
	
	// The ID of this task, which is a randomly generated combination of numbers and letters
	private String id;
	
	// The title of this task
	private String title;
	
	// The due date of this task
	private Date dueDate;
	
	// The task note
	private String note;
	
	// The priority level of this task
	// Retrieve from those static variables in this class
	// HIGH_PRIORITY, MEDIUM_PRIORITY, LOW_PRIORITY
	private int priorityLevel;
	
	// The list of collaborators' email address
	private List<String> collaborators;
	
	// The group this task belongs to
	private Group group;
	
	// The completion status of this task
	// Retrieve from those static variables in this class
	private boolean completionStatus;
	
	
	// COMPUTER GENERATED STUFFS
	
	public Task(String id, String title, Date dueDate, String note,
			int priorityLevel, List<String> collaborators, Group group,
			boolean completionStatus) {
		super();
		this.id = id;
		this.title = title;
		this.dueDate = dueDate;
		this.note = note;
		this.priorityLevel = priorityLevel;
		this.collaborators = collaborators;
		this.group = group;
		this.completionStatus = completionStatus;
	}

	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getPriorityLevel() {
		return priorityLevel;
	}

	public void setPriorityLevel(int priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	public List<String> getCollaborators() {
		return collaborators;
	}

	public void setCollaborators(List<String> collaborators) {
		this.collaborators = collaborators;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public boolean isCompletionStatus() {
		return completionStatus;
	}

	public void setCompletionStatus(boolean completionStatus) {
		this.completionStatus = completionStatus;
	}
	
}
