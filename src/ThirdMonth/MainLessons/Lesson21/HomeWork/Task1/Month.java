package ThirdMonth.MainLessons.Lesson21.HomeWork.Task1;

public enum Month {
    January("winter"),
    February("winter"),
    March("spring"),
    April("spring"),
    MAY("spring"),
    June("summer"),
    July("summer"),
    August("summer"),
    September("autumn"),
    October("autumn"),
    November("autumn"),
    December("winter");

    private String season;

    Month(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        Month currentMonth= Month.valueOf(scan.next());
        Month currentMonth=Month.August;
        if(currentMonth.getSeason().equals("summer")){
            System.out.println(currentMonth + " is summer");
        } else {
            System.out.println(currentMonth + " is in the " + currentMonth.getSeason() + " season");
        }
    }
}
