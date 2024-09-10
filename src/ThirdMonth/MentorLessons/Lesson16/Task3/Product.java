package ThirdMonth.MentorLessons.Lesson16.Task3;

public abstract class Product {
    String name;
    double unitPrice;
    double amount;

    public Product(String name, double unitPrice, double amount) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    public double getCost(){
        return unitPrice * amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", amount=" + amount +
                '}';
    }
}
