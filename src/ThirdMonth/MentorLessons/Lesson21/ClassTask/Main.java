package ThirdMonth.MentorLessons.Lesson21.ClassTask;

public class Main {
    public static void main(String[] args) {
        CoffeeOrder coffeeOrder=new CoffeeOrder(CoffeeType.AMERICANO, CoffeeSize.LARGE);
        System.out.println( "Prize: " +coffeeOrder.finalPrize());
        System.out.println(coffeeOrder);
    }

}
