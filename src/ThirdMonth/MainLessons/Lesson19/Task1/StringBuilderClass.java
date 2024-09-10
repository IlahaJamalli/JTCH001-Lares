package ThirdMonth.MainLessons.Lesson19.Task1;

public class StringBuilderClass {
    public static void main(String[] args) {

        StringBuilder quote=new StringBuilder("Never say never ");

        quote.append("- name");
        int year=2023;
        quote.insert(0, year + " ");
        System.out.println(quote.toString());
    }
}
