package ch12.Q5_wooyoung;
import java.util.HashSet;
public class Test {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>( );
		
		set.add(new Student("100", "ȫ�浿"));
		set.add(new Student("200", "������"));
		set.add(new Student("300", "�̼���"));
		set.add(new Student("400", "�����"));
		set.add(new Student("100", "���߱�"));
		
		System.out.println(set);
	}
}
