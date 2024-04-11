
package construct;

public class MethodInitMain3 {
	public static void main(String[] args) {
		MemberInit member1 = new MemberInit();
		member1.initMember("User-1", 16, 3);

		MemberInit member2 = new MemberInit();
		member2.initMember("User-2", 14, 1);

		MemberInit[] members = {member1, member2};

		for (MemberInit member : members) {
			System.out.println(STR."이름: \{member.name}, 나이: \{member.age}, 학년: \{member.grade}학년");
		}
	}
}