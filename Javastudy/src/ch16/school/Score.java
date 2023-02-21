package ch16.school;

public class Score {
	// 1) 멤버 변수 : 어떤 학생이 어떤 과목의 어떤 점수를 받는다.
	int studentId;
	Subject subject;
	int point;
	
	// 2) 생성자
	public Score(int studentId, Subject subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}
	

	// toString() method 재정의
	public String toString() {
		return "학번:" + studentId + "," + subject.getSubjectName() + ":" + point;
	}
}
