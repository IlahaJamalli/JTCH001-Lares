package ThirdMonth.MentorLessons.Lesson25.Task1;

import java.util.ArrayList;

public class MovieCasting {
    public static void main(String[] args) {
        ArrayList<Actor> actors=new ArrayList<>();
        ArrayList<Role> roles=new ArrayList<>();

        actors.add(new Actor("John Doe", 25, 8));
        actors.add(new Actor("Jane Smith", 30, 9));
        actors.add(new Actor("Sam Brown", 22, 7));
        actors.add(new Actor("Lucy Green", 35, 10));


        roles.add(new Role("Hero", 20, 30));
        roles.add(new Role("Villain", 30, 40));
        roles.add(new Role("Sidekick", 20, 25));
        roles.add(new Role("Extra", 18, 35));

        System.out.println();
        for(Actor actor: actors){
            for(Role role: roles){
                if(actor.getAge()>=role.getMinAge() && actor.getAge()<= role.getMaxAge()){
                    System.out.println(actor.getName() + " is cast as " + role.getName() + " (Age: " + actor.getAge() + ", Skill: " + actor.getActingSkill() + ")");
                }
            }
        }

    }
}
