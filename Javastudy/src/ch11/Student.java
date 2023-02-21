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
		return studentName + "의 학번은 " + studentId; 
	}
	

	// 서로 다른 인스턴스로 생성되었지만 논리적으로 같은 학생
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
	
	// 논리적으로 같은 두 학생은 같은 해시 코드 값 반환하기
	// 일반적으로 hashCode 재정의 시, equals() 메서드에서 논리적으로 같다는 걸 구현할 때 사용할
	// 멤버 변수를 활용하는 것이 좋다.
	@Override
	public int hashCode() {
		return studentId;
	}
	
	public static void main(String[] args) {
		Student wy = new Student(1, "이가나");
		Student a = new Student(1, "이가나");
				
		System.out.println(wy);
		System.out.println(wy.toString()); 
		// ch11.Student@7a81197d -> override 이후 '이가나의 학번은 1'
		System.out.println(wy.equals(a));
		// false(물리적으로 다른 주소값이기 때문) -> true (논리적으로 같은 값)
		System.out.println(wy.hashCode());
		// 2055281021 -> 1
	}

}
