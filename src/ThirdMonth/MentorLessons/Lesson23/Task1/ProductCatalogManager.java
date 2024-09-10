package ThirdMonth.MentorLessons.Lesson23.Task1;

public class ProductCatalogManager {
    public static void main(String[] args) {
        ProductCatalog productCatalog=new ProductCatalog();
        Product product1=new Product("Computer", 2000, "Electronics");
        Product product2=new Product("Phone", 1479, "Electronics");
        Product product3=new Product("Headphone", 234, "Electronics");

        productCatalog.addProduct(product1);
        productCatalog.addProduct(product2);
        productCatalog.addProduct(product3);

        productCatalog.printCatalog();

        productCatalog.containsProduct("Phone");
        productCatalog.removeProduct("Headphone");
        productCatalog.printCatalog();

    }
}
