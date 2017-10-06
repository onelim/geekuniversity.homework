package ru.geekuniveersity.homework.j2.lesson1.obstacles;

import ru.geekuniveersity.homework.j2.lesson1.competitors.Competitor;
import ru.geekuniveersity.homework.j2.lesson1.competitors.Team;

public class Course {
    private final Obstacle[] course;
    
    public Course(final Obstacle... obstacles) {
        this.course = obstacles;
    }
    
    public void doIt(final Team team) {
        System.out.println("\nКоманда " + team.getName() + " стартовала!\n");
        for (Competitor c : team.teamMembers()) {
            for (Obstacle o : this.course) {
                o.doIt(c);
            }
    
            team.addFinishedMember(c);
            team.finishedMembers();
        }
    }
}
