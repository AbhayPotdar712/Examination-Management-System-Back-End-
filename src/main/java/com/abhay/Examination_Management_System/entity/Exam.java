package com.abhay.Examination_Management_System.entity;

public class Exam 
{
	private int studId;
	private String studName;
	private String ename;
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exam(int studId, String studName, String ename) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.ename = ename;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Exam [studId=" + studId + ", studName=" + studName + ", ename=" + ename + "]";
	}
	
	
}
