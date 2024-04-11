package final1.ex;

import java.util.PrimitiveIterator;

public class Member {
	private final String id;
	private String name;

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public void changeData (String id, String name) {
//		this.id = id;
		this.name = name;
	}

	public void print() {
		System.out.println(STR."id + \", name: \"+ name = \{id}, name: \{name}");

	}
}
