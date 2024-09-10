package ThirdMonth.MentorLessons.Lesson18.Task1;

public class Product {
    String productId;
    String productName;
    double productPrice;
    int StockQuantity;

    public Product(String productId, String productName, double productPrice, int StockQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.StockQuantity = StockQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return productName;
    }

    public double getPrice() {
        return productPrice;
    }

    public int getStockQuantity() {
        return StockQuantity;
    }

    public void reduceStock(int quantity) throws InsufficientStockException {
        if(StockQuantity < quantity){
            throw new InsufficientStockException("Insufficient stock for product: " + productName);
        }
    }
}
