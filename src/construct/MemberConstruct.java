package construct;

public class MemberConstruct {
	String name;
	int age;
	int grade;

	MemberConstruct (String name, int age) {
		this(name, age, 1);
	}
	MemberConstruct (String name, int age, int grade) {
		System.out.println(STR."생성자 호출 name= \{name}, age= \{age}, 학년= \{grade}");
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}
