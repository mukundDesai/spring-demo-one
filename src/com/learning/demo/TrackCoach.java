package com.learning.demo;

class TrackCoach implements Coach{

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Get on the track and run 4 miles.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
