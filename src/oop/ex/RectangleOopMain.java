package oop.ex;

public class RectangleOopMain {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.width = 8;
		rectangle.height = 8;

		int area = rectangle.calcuateArea();
		int perimeter = rectangle.claculatePerimeter();
		boolean square = rectangle.isSquare();

		System.out.println(STR. "사각형의 넓이는 \{area}, 둘레는 \{perimeter}이며 정사각형 여부는 \{square}");
	}
}
