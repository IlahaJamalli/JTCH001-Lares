package ThirdMonth.MentorLessons.Lesson21.ClassTask;

public class CoffeeOrder {
        CoffeeType coffeeType;
        CoffeeSize coffeeSize;

    public CoffeeOrder(CoffeeType coffeeType, CoffeeSize coffeeSize) {
        this.coffeeType = coffeeType;
        this.coffeeSize = coffeeSize;
    }

    public double finalPrize(){
        return coffeeType.getPrize()*coffeeSize.getValue();
    }

    @Override
    public String toString() {
        return "CoffeeOrder{" +
                "coffeeType=" + coffeeType +
                ", coffeeSize=" + coffeeSize +
                '}';
    }
}
