package ThirdMonth.MentorLessons.Lesson23.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductCatalog {
    List<Product> products=new ArrayList<>();

    Scanner scanner =new Scanner(System.in);
    public void  addProduct(Product product){
        products.add(product);
    }
   public void removeProduct(String productName){
        products.remove(productName);
   }
    public boolean containsProduct(String productName){
        for (Product product: products){
            if (product.getName().equals(productName)){
                return true;
            }
        } return false;
    }

    public void printCatalog(){

        for (Product product: products){
            System.out.println(product);
        }

    }
}
