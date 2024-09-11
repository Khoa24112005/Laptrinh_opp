package baiTap10;

public class Product {
    private String description;
    private String productID;
    private double price;

    // Constructor không đối số
    public Product() {
    }

    // Constructor có đối số
    public Product(String description, String productID, double price) {
        this.description = description;
        this.productID = productID;
        this.price = price;
    }

    // Getter và Setter
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Product ID: " + productID + ", Description: " + description + ", Price: " + price;
    }
}

