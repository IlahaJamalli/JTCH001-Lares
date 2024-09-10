package SecondMonth;
public class TimeCalculator {
    public void calculateDifference(int hour1, int minute1, int hour2, int minute2){
        int hourDifference=hour1-hour2;
        int minuteDifference=minute1-minute2;
        if(hourDifference<0 && minuteDifference<0){
            System.out.println("invalid input");
        } else{
            System.out.println("There is " + hourDifference + " hour "+ minuteDifference + " minutes difference.");
        }
    }

//    public void calculateDifference(String time1, String time2){
//        int number1=Integer.valueOf(time1);
//        int number2=Integer.valueOf(time2);
//
//            System.out.println(number2-number1);
//
//    }

    public static void main(String[] args) {
        TimeCalculator first=new TimeCalculator();
        first.calculateDifference(5, 30, 4, 10);
//        first.calculateDifference("05:30","04:10" );
    }
}
