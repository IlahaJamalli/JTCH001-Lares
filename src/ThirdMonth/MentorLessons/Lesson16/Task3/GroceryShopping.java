package ThirdMonth.MentorLessons.Lesson16.Task3;

public class GroceryShopping {

     Product shoppingList[];
    int count=0;

    public GroceryShopping(int capacity) {
        shoppingList = new Product[capacity];
    }

    public void addProduct(Product product){
        if(count<shoppingList.length){
            shoppingList[count]=product;
            count++;
        }
    }
    public double calculateTotalCost(){
        double totalCost=0;
        for (int i = 0; i < count; i++) {
            totalCost+=shoppingList[i].getCost();
        } return totalCost;
    }
    public void printReceipt(){
        System.out.println("Receipt:");
        for (int i = 0; i < count; i++) {
            System.out.println(shoppingList[i]);
        }
        System.out.println("Total cost:" + calculateTotalCost());
    }

}
