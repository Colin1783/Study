package static2;

import static static2.DecoData.*;
public class DecoDataMain {
	public static void main(String[] args) {
		System.out.println("정적 호출");
		staticCall();
		staticCall();
		staticCall();

		System.out.println("인스턴스 호출");
		DecoData data1 = new DecoData();
		data1.instanceCall();

		System.out.println("인스턴스 호출2");
		DecoData data2 = new DecoData();
		data2.instanceCall();
	}
}
