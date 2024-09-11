package baiTap10;

public class OrderDetail {
    private int quantity;
    private Product product;

    // Constructor
    public OrderDetail(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // Getter và Setter
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    // Tính tổng tiền cho một dòng sản phẩm
    public double calcTotalPrice() {
        return quantity * product.getPrice();
    }

    // Phương thức toString
    @Override
    public String toString() {
        return product.toString() + ", Quantity: " + quantity + ", Total Price: " + calcTotalPrice();
    }
}

