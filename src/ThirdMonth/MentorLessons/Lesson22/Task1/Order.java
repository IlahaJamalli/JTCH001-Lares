package ThirdMonth.MentorLessons.Lesson22.Task1;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Pizza> pizzas = new ArrayList<>();
    int pizzaCount=0;

    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    public void printAllPizzas(){
        for (Pizza p : pizzas){
            System.out.println(p);
        }
    }

    public void calculateListOfPizzas(){
        double totalPrice=0;
        for (Pizza pizza : pizzas){
            double price = pizza.calculate();
            totalPrice=totalPrice+price;
        }
        System.out.println("Total price is "+ totalPrice);
    }
}
