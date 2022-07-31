package com.abhay.Examination_Management_System;

import java.util.Scanner;

import com.abhay.Examination_Management_System.entity.Exam;
import com.abhay.Examination_Management_System.service.ExamService;
	
public class App 
{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ip = new Scanner(System.in);		
		char ch = 'Y';
		int id;
		String name;
		String ename;
	    Exam e;
		
		ExamService examservice = new ExamService();
		
		while (ch == 'Y') {
			System.out.println("Examination Management System");
			System.out.println("1. Add Exam");
			System.out.println("2. View Exams");
			System.out.println("3. Update Exmas");
			System.out.println("4. Delete Exams");
	
						
			System.out.println("Enter your choice:");
			int option = ip.nextInt();
			
			switch (option) {
				case 1:
					System.out.println("Enter the details of an Student:");
					System.out.println("Enter the Student ID:");
					id = ip.nextInt();
					System.out.println("Enter the Student Name:");
					name = ip.next();
					System.out.println("Enter the name of Exam:");
					ename=ip.next();
					
					e = new Exam(id, name, ename);
					examservice.addExam(e);
					break;
					
				case 2:
					examservice.viewExam();
					break;
					
				case 3:
					System.out.println("Enter the details of an Student:");
					System.out.println("Enter the Student ID:");
					id = ip.nextInt();
					System.out.println("Enter the Student Name:");
					name = ip.next();
					System.out.println("Enter the name of Exam:");
					ename=ip.next();
					
					e = new Exam(id, name,ename );
					examservice.updateExam(e);
					break;
					
				case 4:
					System.out.println("Enter the id of the Student need to deleted:");
					System.out.println("Enter the Student ID:");
					id = ip.nextInt();
					examservice.deleteExam(id);
					break;
				
				default:
					System.out.println("Wrong Option");
					break;
			}
			System.out.println("Want to continue press Y...");
			ch = ip.next().charAt(0);
		}
		System.out.println("Thank you for Using....");
	}
}
