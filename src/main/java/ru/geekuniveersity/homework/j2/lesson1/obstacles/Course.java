package ru.geekuniveersity.homework.j2.lesson1.obstacles;

import ru.geekuniveersity.homework.j2.lesson1.competitors.Competitor;
import ru.geekuniveersity.homework.j2.lesson1.competitors.Team;

public class Course {
    private final Obstacle[] course;
    
    public Course(final Obstacle... obstacles) {
        this.course = obstacles;
    }
    
    public void doIt(final Team team) {
        for (Competitor c : team.teamMembers()) {
            for (Obstacle o : this.course) {
                o.doIt(c);
            }
            
            team.setMemberFinish(c);
            team.finishedMembers();
        }
    }
}
