package ru.geekuniveersity.homework.j2.lesson1.obstacles;

import ru.geekuniveersity.homework.j2.lesson1.competitors.Competitor;

public class Water extends Obstacle {
    int length;
    
    public Water(int length) {
        this.length = length;
    }
    
    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}
