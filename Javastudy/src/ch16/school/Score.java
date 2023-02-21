package ch16.school;

public class Score {
	// 1) ��� ���� : � �л��� � ������ � ������ �޴´�.
	int studentId;
	Subject subject;
	int point;
	
	// 2) ������
	public Score(int studentId, Subject subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}
	

	// toString() method ������
	public String toString() {
		return "�й�:" + studentId + "," + subject.getSubjectName() + ":" + point;
	}
}
