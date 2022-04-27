package com.crud.controller;

import java.sql.Connection;
import java.util.ArrayList;

import com.crud.model.Student;
import com.crud.service.StudentService;

public class StdudentController {
	
	StudentService studservice= new StudentService();
	
	public ArrayList<Student> getAllRecords(){
		ArrayList<Student> list=new ArrayList<>();
			list=studservice.getAllRecords();
		return list;
		}
		//Insert Record in Table
		public int insertRecord(Student student){
			int result=0;
			result=studservice.insertRecord(student);
			return result;
		
		}
		public int deleteRecord(int rollno){
			int result=0;
			result=studservice.deleteRecord(rollno);
			return result;
		}
		
		public int updateRecord(Student student){
			int result=0;
			result=studservice.updateRecord(student);
			return result;
		}
		public Student getStudentByRollno(int rollno){
			Student student=null;
			student=studservice.getStudentByRollno(rollno);
			return student;
		}


}
