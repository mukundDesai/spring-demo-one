package com.learning.demo;

class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Your fortune is great today!";
    }
}
