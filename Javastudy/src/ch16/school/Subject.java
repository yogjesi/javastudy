package ch16.school;

import java.util.ArrayList;

public class Subject {
	// 1) 멤버 변수 : 과목 id, 과목 이름, 학점 평가 방법, 수강하는 학생 list
	private int subjectId;
	private String subjectName;
	private int gradeType;
	
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	// 2) 생성자
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
	}
	
	// 3) method - 1. 이 과목의 수강하는 학생 추가하는 메서드
	public void register(Student student) {
		studentList.add(student);
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public int getGradeType() {
		return gradeType;
	}
	
	public String getSubjectName() {
		return this.subjectName;
	}
}
