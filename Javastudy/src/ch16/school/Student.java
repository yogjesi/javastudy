package ch16.school;

import java.util.ArrayList;

public class Student {
	// 1) 멤버 변수 : 학번, 이름, 필수 과목, 점수 리스트
	private int studentId; // 이 학생의 학번
	private String studentName; // 이 학생의 이름
	private Subject majorSubject; //이 학생의 필수 과목
	
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	// 학생이 수강한 과목의 점수 리스트
	
	//2) 생성자
	public Student(int studentId, String studentName, Subject majorSubject) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	// 3) method - 1. 점수 리스트에 점수 입력하기
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}
	
	public ArrayList<Score> getScoreList(){
		return scoreList;
	}
	
	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
}
