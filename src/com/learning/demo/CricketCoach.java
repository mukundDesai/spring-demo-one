package com.learning.demo;

public class CricketCoach implements Coach{


    private FortuneService fortuneService;

    public CricketCoach(){
        System.out.println("CricketCoach : inside no-arg constructor");
    }

    //for setter injection
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Face 5 overs in the nets.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
