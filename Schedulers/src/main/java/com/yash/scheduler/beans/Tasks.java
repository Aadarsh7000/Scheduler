package com.yash.scheduler.beans;

import java.util.Objects;

public class Tasks {
	private long task_id;
	private String task_title;
	private String descripton;
	private String start_date;
	private String end_date;
	private String start_time;
	private String end_time;
	private String status;
	private String priority;

	public Tasks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tasks( String task_title, String descripton, String start_date, String end_date,
			String start_time, String end_time, String status, String priority) {
		super();
		this.task_title = task_title;
		this.descripton = descripton;
		this.start_date = start_date;
		this.end_date = end_date;
		this.start_time = start_time;
		this.end_time = end_time;
		this.status = status;
		this.priority = priority;
	}

	
	public String getTask_title() {
		return task_title;
	}

	public void setTask_title(String task_title) {
		this.task_title = task_title;
	}

	public String getDescripton() {
		return descripton;
	}

	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Tasks [taskid=" + taskid + ", task_title=" + task_title + ", descripton=" + descripton + ", start_date="
				+ start_date + ", end_date=" + end_date + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", status=" + status + ", priority=" + priority + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(descripton, end_date, end_time, priority, start_date, start_time, status, task_title,
				taskid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tasks other = (Tasks) obj;
		return Objects.equals(descripton, other.descripton) && Objects.equals(end_date, other.end_date)
				&& Objects.equals(end_time, other.end_time) && Objects.equals(priority, other.priority)
				&& Objects.equals(start_date, other.start_date) && Objects.equals(start_time, other.start_time)
				&& Objects.equals(status, other.status) && Objects.equals(task_title, other.task_title)
				&& taskid == other.taskid;
	}

}
