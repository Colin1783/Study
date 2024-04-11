package construct;

public class MethodInitMain2 {
	public static void main(String[] args) {
		MemberInit member1 = new MemberInit();
		initMember(member1, "user1", 19, 3);

		MemberInit member2 = new MemberInit();
		initMember(member2, "user2", 17, 1);

		MemberInit[] members = {member1, member2};

		for (MemberInit member : members) {
			System.out.println(STR."이름: \{member.name}, 나이: \{member.age}, 학년: \{member.grade}학년");
		}
	}

	static void initMember(MemberInit member, String name, int age, int grade) {
		member.name = name;
		member.age = age;
		member.grade = grade;
	}
}
