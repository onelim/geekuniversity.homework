package ru.geekuniveersity.homework.j2.lesson1.obstacles;

import ru.geekuniveersity.homework.j2.lesson1.competitors.Competitor;

public class Cross extends Obstacle {
    int length;
    
    public Cross(int length) {
        this.length = length;
    }
    
    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}
