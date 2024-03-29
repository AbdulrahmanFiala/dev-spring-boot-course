package com.luv2code.springboot.demo.mycoolapp.rest;

import com.luv2code.springboot.demo.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController1 {
    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor for dependency injection
    @Autowired
    public DemoRestController1(@Qualifier("aquatic") Coach thecoach) {
//        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = thecoach;
    }
    // define a setter method for dependency injection
//    @Autowired
//    public void setCoach(Coach thecoach) {
//        myCoach = thecoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


}
