package construct.ex;

public class BookMain {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.displayInfo();

		Book book2 = new Book("이기적 유전자", "리처드 도킨스");
		book2.displayInfo();

		Book book3 = new Book("오만과 편견", "제인 오스틴", 340);
		book3.displayInfo();
	}
}
