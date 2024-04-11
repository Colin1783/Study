package ref.ex;

public class ProductOrderMain2 {
	public static void main(String[] args) {
		ProductOrder order1 = createOrder("두부", 1000, 2);
		ProductOrder order2 = createOrder("김치", 10000, 1);
		ProductOrder order3 = createOrder("담배", 4500, 1);

		ProductOrder[] orders = new ProductOrder[3];
		orders[0] = order1;
		orders[1] = order2;
		orders[2] = order3;

		printOrder(orders);
		int totalAmount = getTotalAmount(orders);
		System.out.println(STR."총 결제 금액: \{totalAmount}");
	}

	static ProductOrder createOrder(String productName, int price, int quantity) {
		ProductOrder order = new ProductOrder();
		order.productName = productName;
		order.price = price;
		order.quantity = quantity;
		return order;
	}

	static void printOrder(ProductOrder[] orders) {
		for (ProductOrder order : orders) {
			System.out.println(STR."상품명: \{order.productName}, 가격: \{order.price}, 수량: \{order.quantity}");
		}
	}

	static int getTotalAmount(ProductOrder[] orders) {
		int totalAmount = 0;
		for (ProductOrder order : orders) {
			totalAmount += order.price * order.quantity;
		}
		return totalAmount;
	}
}
