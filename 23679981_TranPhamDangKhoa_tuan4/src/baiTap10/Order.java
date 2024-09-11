package baiTap10;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private ArrayList<OrderDetail> lineItems;
    private int count = 0;

    // Constructor
    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = new ArrayList<>();
    }

    // Thêm sản phẩm vào đơn hàng
    public void addLineItem(Product product, int quantity) {
        OrderDetail orderDetail = new OrderDetail(product, quantity);
        lineItems.add(orderDetail);
        count++;
    }

    // Tính tổng số tiền của hóa đơn
    public double calcTotalCharge() {
        double total = 0;
        for (OrderDetail detail : lineItems) {
            total += detail.calcTotalPrice();
        }
        return total;
    }

    // Getter và Setter
    public ArrayList<OrderDetail> getLineItems() {
        return lineItems;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderID() {
        return orderID;
    }

    // Phương thức toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(orderID).append(", Order Date: ").append(orderDate).append("\n");
        for (OrderDetail detail : lineItems) {
            sb.append(detail).append("\n");
        }
        sb.append("Total Charge: ").append(calcTotalCharge());
        return sb.toString();
    }
}

