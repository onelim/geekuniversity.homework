package ru.geekuniveersity.homework.j2.lesson1.competitors;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private final String teamName;
    private final Competitor[] competitors;
    private final List<Competitor> finishedMembers;
    
    public Team(final String teamName, final Competitor... competitors) {
        this.teamName = teamName;
        this.competitors = competitors;
        this.finishedMembers = new ArrayList<>();
    }
    
    public Competitor[] teamMembers() {
        return this.competitors;
    }
    
    public void finishedMembers() {
        for (Competitor competitor : this.finishedMembers) {
            System.out.println(String.format("Участник %s %s прошел всю дистанцию!", competitor.getType(), competitor.getName()));
        }
    }
    
    public void showResults() {
        for (Competitor competitor : this.competitors) {
            competitor.info();
        }
    }
    
    public void setMemberFinish(final Competitor competitor) {
        this.finishedMembers.add(competitor);
    }
}
