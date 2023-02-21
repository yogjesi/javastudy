package ch11;

public class Student {
	int studentId;
	String studentName;
	
	Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentName + "�� �й��� " + studentId; 
	}
	

	// ���� �ٸ� �ν��Ͻ��� �����Ǿ����� �������� ���� �л�
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId)
				return true;
			else return false;
		}
		return false;
	}
	
	// �������� ���� �� �л��� ���� �ؽ� �ڵ� �� ��ȯ�ϱ�
	// �Ϲ������� hashCode ������ ��, equals() �޼��忡�� �������� ���ٴ� �� ������ �� �����
	// ��� ������ Ȱ���ϴ� ���� ����.
	@Override
	public int hashCode() {
		return studentId;
	}
	
	public static void main(String[] args) {
		Student wy = new Student(1, "�̰���");
		Student a = new Student(1, "�̰���");
				
		System.out.println(wy);
		System.out.println(wy.toString()); 
		// ch11.Student@7a81197d -> override ���� '�̰����� �й��� 1'
		System.out.println(wy.equals(a));
		// false(���������� �ٸ� �ּҰ��̱� ����) -> true (�������� ���� ��)
		System.out.println(wy.hashCode());
		// 2055281021 -> 1
	}

}
