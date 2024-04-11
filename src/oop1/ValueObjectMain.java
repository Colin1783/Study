package oop1;

public class ValueObjectMain {
	public static void main(String[] args) {
		ValueObject valueObject = new ValueObject();
		valueObject.value = 2;
		valueObject.add();
		valueObject.add();
		valueObject.add();
		valueObject.result();
	}
}
