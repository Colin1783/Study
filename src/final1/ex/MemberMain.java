package final1.ex;

public class MemberMain {
	public static void main(String[] args) {
		Member member = new Member("my ID", "Kim");
		member.print();
		member.changeData("my ID2","Seo");
		member.print();
	}
}
