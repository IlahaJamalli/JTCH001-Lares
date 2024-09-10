package ThirdMonth.MentorLessons.Lesson27.Task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        List<MovieStream> movies = Arrays.asList(
                new MovieStream("The Shawshank Redemption", "Drama"),
                new MovieStream("Inception", "Sci-Fi"),
                new MovieStream("The Dark Knight", "Action"),
                new MovieStream("Pulp Fiction", "Crime"),
                new MovieStream("Fight Club", "Drama"),
                new MovieStream("The Matrix", "Sci-Fi"),
                new MovieStream("Goodfellas", "Crime")
        );
        List<String> list=movies.stream()
                .map(MovieStream::getGenre)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list);
    }


}
