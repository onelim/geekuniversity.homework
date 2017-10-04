package ru.geekuniveersity.homework.j2.lesson1.competitors;

public interface Competitor {
    String getType();
    
    String getName();
    
    void run(int dist);
    
    void swim(int dist);
    
    void jump(int height);
    
    boolean isOnDistance();
    
    void info();
}
