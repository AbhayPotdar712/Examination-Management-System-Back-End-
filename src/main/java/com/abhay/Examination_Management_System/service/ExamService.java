package com.abhay.Examination_Management_System.service;

import java.util.ArrayList;

import com.abhay.Examination_Management_System.entity.Exam;


public class ExamService 
{
	private ArrayList<Exam> examlist;
	
	public  ExamService() {
		this.examlist = new ArrayList<Exam>();
	}

	public boolean addExam(Exam e) {
		boolean b = examlist.add(e);
		System.out.println("Exam got added successfully");
		return b;
	}

	public ArrayList<Exam> viewExam() {
		return examlist;
	}

    public boolean updateExam(Exam e) {
		boolean flag = false;
		for (Exam e1 : examlist) {
			if (e1.getStudId() == e.getStudId()) {
				e1.setStudName(e.getStudName());
				e1.setEname(e.getEname());
				
				flag = true;
			}
		}
		if (flag) {
			System.out.println("Exam data updated..");
		}
		return flag;
	}

	public boolean deleteExam(int studid) {
		boolean flag = false;

		for (int i = 0; i < examlist.size(); i++) {

			if (examlist.get(i).getStudId() == studid) {
				examlist.remove(examlist.get(i));
				flag = true;
			}
		}
		if (flag) {
			System.out.println("Exam data deleted..");
		} 
		return flag;
	}

	
	
}
