package ch16.school;

import java.util.ArrayList;

public class Student {
	// 1) ��� ���� : �й�, �̸�, �ʼ� ����, ���� ����Ʈ
	private int studentId; // �� �л��� �й�
	private String studentName; // �� �л��� �̸�
	private Subject majorSubject; //�� �л��� �ʼ� ����
	
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	// �л��� ������ ������ ���� ����Ʈ
	
	//2) ������
	public Student(int studentId, String studentName, Subject majorSubject) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	// 3) method - 1. ���� ����Ʈ�� ���� �Է��ϱ�
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
