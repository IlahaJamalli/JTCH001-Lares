package ThirdMonth.MentorLessons.Lesson22.Task1;

import java.util.Scanner;

public class PizzaOrderingSystem {
    public static void main(String[] args) {
        Order order  =new Order();
        order.addPizza(new Pizza(PizzaSize.LARGE,PizzaType.MARGHERITA,Topping.MUSHROOMS));
        order.addPizza(new Pizza(PizzaSize.SMALL,PizzaType.PEPPERONI,Topping.CHEESE));
        order.addPizza(new Pizza(PizzaSize.MEDIUM,PizzaType.BBQ_CHICKEN,Topping.TOMATO));
        order.calculateListOfPizzas();
        order.printAllPizzas();
    }
}
