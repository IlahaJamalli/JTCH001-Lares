package ThirdMonth.MentorLessons.Lesson22.Task2;

public class TrafficLightController {
    private TrafficLight currentState;

    public TrafficLightController(TrafficLight trafficLight) {
        this.currentState = trafficLight;
    }

    public void nextState() {
        if(currentState==TrafficLight.RED){
            currentState=TrafficLight.GREEN;
        } else if (currentState==TrafficLight.GREEN) {
            currentState=TrafficLight.YELLOW;
        } else if (currentState==TrafficLight.YELLOW) {
            currentState=TrafficLight.RED;
        }
        System.out.println(currentState);
    }
    public TrafficLight getCurrentState(){
        return currentState;
    }
    public int getCurrentStateDuration(){
        return currentState.getTimer();
    }
    public void runSimulation(int cycles){
        int count=0;
        while (count<cycles){
            System.out.println(getCurrentState());
            System.out.println(getCurrentStateDuration());
            nextState();
            count++;
        }

        }
    }
