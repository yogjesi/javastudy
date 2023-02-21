package ch16.grade;
// 학점 평가 방법은 여러가지가 있기 때문에 산출 방법 클래스가 구현할 내용을
// 인터페이스로 정의하기!
public interface GradeEvaluation {
	//점수에 따른 학점을 문자열로 반환해주는 메서드
	// 이제학점을 산출하는 모든 클래스는 위 인터페이스 구현해야 한다.
	// 필수과목과 일반과목으로 구분해 학점 산출하기 정책. 
	// 밑에 BasicEvaluation, MajorEvaluation이 있다.
	public String getGrade(int point);
}
