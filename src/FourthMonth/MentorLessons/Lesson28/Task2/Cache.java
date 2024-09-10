package FourthMonth.MentorLessons.Lesson28.Task2;

import java.util.HashMap;
import java.util.Map;

public class Cache <K, V>{
    Map<K, V> cache;

    public Cache() {
        this.cache =new HashMap<>();
    }

    public void add(K key, V val){
        cache.put(key, val);
    }

    public V retrieve(K key){
        return cache.get(key);
    }

    public V remove(K key){
       return cache.remove(key);
    }

    public boolean ifContainsKey(K key){
       return cache.containsValue(key);
    }

    @Override
    public String toString() {
        return "Cache{" +
                "cache=" + cache +
                '}';
    }

    public static void main(String[] args) {
        Cache<Integer, String> cache1=new Cache<>();
        cache1.add(2, "new");
        cache1.add(1, "Happy");
        cache1.add(3, "Year");
        System.out.println(cache1);

        System.out.println(cache1.remove(2));

        System.out.println(cache1.retrieve(2));

        System.out.println(cache1.ifContainsKey(4));
    }
}
