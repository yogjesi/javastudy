package ch16.grade;
// ���� �� ����� ���������� �ֱ� ������ ���� ��� Ŭ������ ������ ������
// �������̽��� �����ϱ�!
public interface GradeEvaluation {
	//������ ���� ������ ���ڿ��� ��ȯ���ִ� �޼���
	// ���������� �����ϴ� ��� Ŭ������ �� �������̽� �����ؾ� �Ѵ�.
	// �ʼ������ �Ϲݰ������� ������ ���� �����ϱ� ��å. 
	// �ؿ� BasicEvaluation, MajorEvaluation�� �ִ�.
	public String getGrade(int point);
}
