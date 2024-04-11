package ref;

public class Method1 {
	public static void main(String[] args) {
		Student student1 = new Student();
		initStudent(student1,"학생1", 16, 90);

		Student student2 = new Student();
		initStudent(student2,"학생2", 17, 80);

	}

	static void initStudent (Student student, String name, int age, int grade) {
		student.name = name;
		student.age = age;
		student.grade = grade;
		System.out.println(STR."이름:\{name}, 나이: \{age}, 성적: \{grade}");
	}
}

