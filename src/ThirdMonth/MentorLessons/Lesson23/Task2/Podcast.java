package ThirdMonth.MentorLessons.Lesson23.Task2;

public class Podcast implements Playable{
    String title;
    double duration;

    public Podcast(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }
    @Override
    public String getDetails() {
        return  title + duration;
    }
}
