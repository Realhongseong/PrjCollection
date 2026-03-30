package Collection;

import java.util.ArrayList;
import java.util.HashSet;

class Student {
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Syudent [id=" + id + ", name=" + name + "]";
	}
	
}

public class TestSetStudent {

	public static void main(String[] args) {
		ArrayList<Student> studList = new ArrayList<>();
		
		studList.add(new Student(1, "가나"));
		studList.add(new Student(2, "나나"));
		studList.add(new Student(3, "다나"));
		studList.add(new Student(1, "가나"));
		System.out.println(studList);
		System.out.println(studList.size());
		System.out.println("================================");
		
		//-----------------------------------------------------
		HashSet<Student> studSet = new HashSet<>();
		studSet.add(new Student(1, "가나"));
		studSet.add(new Student(2, "나나"));
		studSet.add(new Student(3, "다나"));
		studSet.add(new Student(1, "가나"));
		
		System.out.println(studSet);
		System.out.println(studSet.size());
	}

}
