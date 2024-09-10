package ThirdMonth.MainLessons.Lesson23;

import java.util.HashMap;
import java.util.Map;

public class HasMapExample {
    public static void main(String[] args) {
        Map<String , Integer> map=new HashMap<>();
        map.put("Ilahe", 100);
        map.put("Leman", 91);
        map.put("Jale", 98);
        map.put("Ugur", 88);
        map.put("Tural", 74);

        System.out.println(map);
        System.out.println(map.get("Ugur"));
        map.remove("Ilahe");
        System.out.println(map);

    }
}
