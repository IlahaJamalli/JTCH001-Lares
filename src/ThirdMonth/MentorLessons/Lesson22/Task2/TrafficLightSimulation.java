package ThirdMonth.MentorLessons.Lesson22.Task2;

public class TrafficLightSimulation {
    public static void main(String[] args) {
        TrafficLightController x=new TrafficLightController(TrafficLight.GREEN);
        x.runSimulation(2);
    }
}
