package com.luv2code.springboot.demo.mycoolapp.entity;

public class Pupil {
    private String firstName;
    private String lastName;
    public Pupil(){

    }
    public Pupil(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
