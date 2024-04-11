package oop.ex;

public class Rectangle {
	int width;
	int height;
	boolean square;

	int calcuateArea() {
		return width * height;
	}

	int claculatePerimeter() {
		return (width + height) * 2;
	}
	boolean isSquare() {
		if (width == height) {
			return true;
		} else {
			return false;
		}
	}
}

