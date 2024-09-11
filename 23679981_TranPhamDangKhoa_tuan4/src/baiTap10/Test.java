package baiTap10;

import java.time.LocalDate;

public class Test {
	 public static void main(String[] args) {
	        // Tạo các sản phẩm
	        Product product1 = new Product("Laptop", "P001", 1000);
	        Product product2 = new Product("Smartphone", "P002", 800);
	        Product product3 = new Product("Tablet", "P003", 500);

	        // Tạo đơn hàng
	        Order order = new Order(1, LocalDate.now());

	        // Thêm sản phẩm vào đơn hàng
	        order.addLineItem(product1, 2);
	        order.addLineItem(product2, 3);
	        order.addLineItem(product3, 1);

	        // Xuất thông tin đơn hàng
	        System.out.println(order);
	    }
}
