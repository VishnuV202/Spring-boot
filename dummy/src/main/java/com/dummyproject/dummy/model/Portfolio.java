package com.dummyproject.dummy.model;

public class Portfolio {

    String name;
    String registerNo;
    String course;
    String hobbies;
    String favouriteFood;
    String funnyExperience;
    String ambition;
    String shortTermGoal;
    String longTermGoal;
    String quote;
    public Portfolio(String name, String registerNo, String course, String hobbies, String favouriteFood,
            String funnyExperience, String ambition, String shortTermGoal, String longTermGoal, String quote) {
        this.name = name;
        this.registerNo = registerNo;
        this.course = course;
        this.hobbies = hobbies;
        this.favouriteFood = favouriteFood;
        this.funnyExperience = funnyExperience;
        this.ambition = ambition;
        this.shortTermGoal = shortTermGoal;
        this.longTermGoal = longTermGoal;
        this.quote = quote;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRegisterNo() {
        return registerNo;
    }
    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getHobbies() {
        return hobbies;
    }
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
    public String getFavouriteFood() {
        return favouriteFood;
    }
    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }
    public String getFunnyExperience() {
        return funnyExperience;
    }
    public void setFunnyExperience(String funnyExperience) {
        this.funnyExperience = funnyExperience;
    }
    public String getAmbition() {
        return ambition;
    }
    public void setAmbition(String ambition) {
        this.ambition = ambition;
    }
    public String getShortTermGoal() {
        return shortTermGoal;
    }
    public void setShortTermGoal(String shortTermGoal) {
        this.shortTermGoal = shortTermGoal;
    }
    public String getLongTermGoal() {
        return longTermGoal;
    }
    public void setLongTermGoal(String longTermGoal) {
        this.longTermGoal = longTermGoal;
    }
    public String getQuote() {
        return quote;
    }
    public void setQuote(String quote) {
        this.quote = quote;
    }
    
}
