package SecondMonth;

public class Author {
String name;
int birthYear;

    public Author(String name, int birthYear) {
        this.name=name;
        this.birthYear=birthYear;

    }
public  String toString(){
        return "Author: " + name + " (Birth Year: " + birthYear + ")";
}

}
