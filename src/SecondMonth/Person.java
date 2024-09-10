package SecondMonth;

public class Person {
    String name;
    int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age=age;
        this.address = address;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAdress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public static void main(String[] args) {
        Person person=new Person("Ilaha",20,  "Xatai");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getAdress());
        person.setName("Leman");
        person.setAge(19);
        person.setAdress("Nerimanov");
        System.out.println("Updated info: ");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getAdress());

    }
}
