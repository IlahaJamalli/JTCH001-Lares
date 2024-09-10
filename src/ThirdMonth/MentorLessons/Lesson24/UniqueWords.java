package ThirdMonth.MentorLessons.Lesson24;

import java.util.HashSet;
import java.util.Set;

public class UniqueWords {

    public static void main(String[] args) {
        String paragraph = "The quick brown fox jumped over the lazy dog," +
                " but the lazy dog didn't notice because the lazy dog was too busy sleeping.";

        String[] words=paragraph.toLowerCase().replaceAll("[^a-zA-Z\\s]", "").split("\\s+");
        Set<String> uniqueWords=new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            uniqueWords.add(words[i]);
        }
        for(String word: uniqueWords){

            System.out.println(word);
        }
    }
}