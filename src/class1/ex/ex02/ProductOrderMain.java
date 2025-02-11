package class1.ex.ex02;

public class ProductOrderMain {
	public static void main(String[] args) {
		ProductOrder product1 = new ProductOrder();
		product1.productName = "두부";
		product1.price = 2000;
		product1.quantity = 2;

		ProductOrder product2 = new ProductOrder();
		product2.productName = "김치";
		product2.price = 5000;
		product2.quantity = 1;

		ProductOrder product3 = new ProductOrder();
		product3.productName = "콜라";
		product3.price = 1500;
		product3.quantity = 2;

		ProductOrder[] orders = {product1, product2, product3};

		int sum = 0;

		for (ProductOrder order : orders ) {
			System.out.println(STR."상품명: \{order.productName}, 가격: \{order.price}, 수량: \{order.quantity}");
			sum += order.price * order.quantity;
		}
		System.out.println(STR."총 결제 금액: \{sum}");
	}
}
