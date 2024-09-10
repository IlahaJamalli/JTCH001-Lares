package ThirdMonth.MainLessons.Lesson21.HomeWork.Task1;

public enum MonthEnum {
    January("winter"),
    February("winter"),
    March("spring"),
    April("spring"),
    May("spring"),
    June("summer"),
    July("summer"),
    August("summer"),
    September("autumn"),
    October("autumn"),
    November("autumn"),
    December("winter");

    private String season;

    MonthEnum(String season) {
        this.season = season;
    }

    public static void main(String[] args) {
        MonthEnum month = MonthEnum.June;

        if (month == MonthEnum.June || month == MonthEnum.July || month == MonthEnum.August) {
            System.out.println(month + " is a summer month.");
        }
    }
}
