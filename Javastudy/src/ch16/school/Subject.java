package ch16.school;

import java.util.ArrayList;

public class Subject {
	// 1) ��� ���� : ���� id, ���� �̸�, ���� �� ���, �����ϴ� �л� list
	private int subjectId;
	private String subjectName;
	private int gradeType;
	
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	// 2) ������
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
	}
	
	// 3) method - 1. �� ������ �����ϴ� �л� �߰��ϴ� �޼���
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
