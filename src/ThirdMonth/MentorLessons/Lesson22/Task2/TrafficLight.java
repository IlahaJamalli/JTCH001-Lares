package ThirdMonth.MentorLessons.Lesson22.Task2;

public enum TrafficLight {
    RED(120),
    YELLOW(30),
    GREEN(60);

    private int timer;

    TrafficLight(int timer) {
        this.timer = timer;
    }

    public int getTimer() {
        return timer;
    }
}
