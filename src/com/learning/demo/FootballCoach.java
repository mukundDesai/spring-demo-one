package com.learning.demo;

class FootballCoach implements Coach{

    private FortuneService fortuneService;

    public FootballCoach() {
    }

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run the new formation.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
