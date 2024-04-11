package construct.ex;

public class Book {
	String title;
	String author;
	int page;

	// TODO 코드를 완성하세요
	Book () {
		this("", "",0);
	}

	Book (String title, String author) {
		this(title, author, 450);

	}
	Book (String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
	}

	void displayInfo () {
		System.out.println(STR."제목: \{title}, 저자: \{author}, 페이지: \{page}");
	}
}
