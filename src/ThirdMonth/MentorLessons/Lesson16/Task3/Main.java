package ThirdMonth.MentorLessons.Lesson16.Task3;

public class Main {
    public static void main(String[] args) {
        GroceryShopping groceryShopping=new GroceryShopping(3);
        groceryShopping.addProduct(new Dairy("Milk", 2, 1));
        groceryShopping.addProduct(new FreshProduce("apple", 1, 10));
        groceryShopping.addProduct(new Meat("Chicken", 5.0, 1) );

        groceryShopping.printReceipt();
    }
}
