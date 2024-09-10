package SecondMonth;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        ScientificCalculator calc=new ScientificCalculator();
        System.out.println(calculator.add(2, 4));
        System.out.println(calculator.add(2929, 98, 87));
        System.out.println(calc.power(8, 9));
        System.out.println(calculator.add(4.5, 7.8));

    }
}
