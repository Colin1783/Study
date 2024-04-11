package oop.ex;

public class RectangleProceduralMain {
	public static void main(String[] args) {
		int width = 5;
		int height = 8;
		int area = calcuateArea(width, height);
		System.out.println("넓이= " + area);

		int perimeter = claculatePerimeter(width, height);
		System.out.println("둘레 길이= " + perimeter);

		boolean square = isSquare(width, height);
		System.out.println("정사각형 여부= " + square);
	}

	static int calcuateArea(int width, int height) {
		return width * height;
	}

	static int claculatePerimeter(int width, int height) {
		return (width + height) * 2;
	}
	static boolean isSquare(int width, int height) {
		if (width == height) {
			return true;
		} else {
			return false;
		}
	}
}

