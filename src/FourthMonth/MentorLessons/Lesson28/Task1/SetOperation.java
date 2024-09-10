package FourthMonth.MentorLessons.Lesson28.Task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperation {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2=new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

    }

    public Set<Integer> union(Set<Integer> set1, Set<Integer> set2){

        Set<Integer> unionResult=new HashSet<>();

        for(int num: set1){
            unionResult.add(num);
        }
        for(int num: set2){
            unionResult.add(num);
        }
        return unionResult;
    }

    public Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){

        Set<Integer> result2=new HashSet<>();

        for(int num: set1){
            if(set2.contains(set1)){
                result2.add(num);
            }
        } return result2;
    }

    public Set<Integer> nonIntersecting(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> result3=new HashSet<>();

        for(int num: set1){
            if(!set1.contains(set2)){
                set1.add(num);
            }
        }
        for(int num: set2){
            if(!set2.contains(set1)){
                set2.add(num);
            }
        }

        return result3;

    }
}
