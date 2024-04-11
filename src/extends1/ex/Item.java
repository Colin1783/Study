package extends1.ex;

public class Item {
	public String title;
	public int price;

	public Item(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public void print () {
		System.out.println("이름: " + title + ", 가격: " + price);
	}
	public int getPrice(){
		return price;
	}
}
