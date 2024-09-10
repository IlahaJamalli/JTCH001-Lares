package ThirdMonth.MentorLessons.Lesson18.Task1;

public class Order {
    String[] productIds;
    int[] quantities;
    int orderCount;
    int maxOrderSize=100;

    public Order() {
        productIds=new String[maxOrderSize];
        quantities=new int[maxOrderSize];
        orderCount=0;
    }

    public void addProduct(String productId,int quantity){
        if(orderCount<maxOrderSize){
            productIds[orderCount]=productId;
            quantities[orderCount]=quantity;
            orderCount++;
        } else{
            System.out.println("Order is full.");
        }
    }

    public void orderProduct(ProductCatalog catalog, PaymentProcessor paymentProcessor){
        double totalAmount=0;
        for (int i = 0; i < orderCount; i++) {
            try {
                Product product=catalog.findProductById(productIds[i]);
                product.reduceStock(quantities[i]);
                totalAmount+= product.getPrice()*quantities[i];
            }catch (ProductNotFoundException | InsufficientStockException e){
                System.out.println(e.getMessage());
            }
        }
        try {
            paymentProcessor.processPayment(totalAmount);
        } catch (PaymentProcessingException e){
            System.out.println(e.getMessage());
        }

    }
}
