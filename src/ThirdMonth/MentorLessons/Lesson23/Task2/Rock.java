package ThirdMonth.MentorLessons.Lesson23.Task2;

public class Rock implements Music{
    String title;
    String artist;
    double duration;

    public Rock(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String getDetails() {
        return  "title: "+ title +" artist: "+ artist +" duration: "+duration;
    }
}
