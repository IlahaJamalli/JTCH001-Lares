package ThirdMonth.MentorLessons.Lesson22.Task1;

public class Pizza {
    PizzaSize pizzaSize;
    PizzaType pizzaType;
    Topping topping;

    public Pizza(PizzaSize pizzaSize, PizzaType pizzaType, Topping topping) {
        this.pizzaSize = pizzaSize;
        this.pizzaType = pizzaType;
        this.topping = topping;
    }

    public double calculate(){
        return pizzaSize.getPrice()+ pizzaType.getPrice() + topping.toppingPrice;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaSize=" + pizzaSize +
                ", pizzaType=" + pizzaType +
                ", topping=" + topping +
                '}';
    }
}
