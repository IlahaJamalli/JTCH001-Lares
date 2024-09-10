package ThirdMonth.MentorLessons.Lesson18.Task1;

public class ProductCatalog {

    Product[] products;
    int productCount;

    public ProductCatalog(int size) {
        products = new Product[size];
        productCount=0;
    }

    public void addProduct(Product product){

        if(productCount<products.length){
            products[productCount]=product;
            productCount++;
        } else{
            System.out.println("Catalog is full, cannot add more products.");
        }
    }

    public Product findProductById(String productId) throws ProductNotFoundException {

        for (int i = 0; i < productCount; i++) {
            if(products[i].getProductId().equals(productId)){
                return products[i];
            }
        } throw new ProductNotFoundException("Product with ID: " + productId + " not found.");
    }
}
