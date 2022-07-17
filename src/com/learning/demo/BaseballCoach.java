package com.learning.demo;

class BaseballCoach implements Coach {

    //define a private field
    private FortuneService fortuneService;

    public BaseballCoach() {
    }

    //constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
