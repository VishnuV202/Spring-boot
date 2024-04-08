package com.dummyproject.dummy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dummyproject.dummy.model.Portfolio;

@RestController
public class Controller {

    @GetMapping("/portfolio")
        public String getPortfolio()
        {
            Portfolio portfolio = new Portfolio("Vishnu V","727722EUCS202","Web Frameworks","Music, Movies","I don't have anything as Favourite in foods","Once I accidentally poured washing liquid in my head instead of Shampoo","To become a Good Software Developer","To be consistent in stuff that I am currently working on","Lead a happy life with all my loved ones","You can try to be a good person but you don't need to prove that to others");
            return "<p style=\"font-family:Candara;font-size:200%\"><b>Name : </b>"+portfolio.getName()+"<br>"+
            "<b>Register No : </b>"+portfolio.getRegisterNo()+"<br>"+
            "<b>Course : </b>"+portfolio.getCourse()+"<br>"+
            "<b>Hobbies : </b>"+portfolio.getHobbies()+"<br>"+
            "<b>Favourite Food : </b>"+portfolio.getFavouriteFood()+"<br>"+
            "<b>Funny Experience : </b>"+portfolio.getFunnyExperience()+"<br>"+
            "<b>Ambition : </b>"+portfolio.getAmbition()+"<br>"+
            "<b>Short Term Goal : </b>"+portfolio.getShortTermGoal()+"<br>"+
            "<b>Long Term Goal : </b>"+portfolio.getLongTermGoal()+"<br>"+
            "<b>Quote : </b>"+portfolio.getQuote();

        }
        
}
