package construct;

import java.util.Arrays;

public class ConstructMain1 {
	public static void main(String[] args) {

	MemberConstruct member1 = new MemberConstruct("User-1", 18, 2);
	MemberConstruct member2 = new MemberConstruct("User-2", 19, 3);

	MemberConstruct[] members = new MemberConstruct[2];
	members[0] = member1;
	members[1] = member2;

	for (MemberConstruct s : members) {
		System.out.println(STR. "이름 : \{s.name}, 나이: \{s.age}, 학년: \{s.grade}");
	}

	}
}
