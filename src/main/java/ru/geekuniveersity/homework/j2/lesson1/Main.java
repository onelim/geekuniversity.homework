package ru.geekuniveersity.homework.j2.lesson1;

import ru.geekuniveersity.homework.j2.lesson1.competitors.*;
import ru.geekuniveersity.homework.j2.lesson1.obstacles.Course;
import ru.geekuniveersity.homework.j2.lesson1.obstacles.Cross;
import ru.geekuniveersity.homework.j2.lesson1.obstacles.Obstacle;
import ru.geekuniveersity.homework.j2.lesson1.obstacles.Wall;

public class Main {
    public static void main(String[] args) {
        Competitor[] humans = {new Human("Боб"), new Human("Карл"), new Human("Кейт")};
        Competitor[] animals = {new Dog("Бобик"), new Cat("Барсик"), new Dog("Бобик")};
        
        
        Obstacle[] obstacles = {new Cross(80), new Wall(2), new Wall(1), new Cross(120)};
        
        
        Team humanTeam = new Team("Humans", humans);
        Team animalTeam = new Team("Animals", animals);
        
        Course course = new Course(obstacles);
        course.doIt(humanTeam);
        course.doIt(animalTeam);
        
        humanTeam.showResults();
        animalTeam.showResults();
    }
}
