package com.luv2code.springboot.demo.mycoolapp;


import com.luv2code.springboot.demo.mycoolapp.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName = "";
    @NotNull(message = "is required")
    @Min(value = 0, message = "Must be greater than or equal to 0")
    @Max(value = 10, message = "Must be less than or equal to 10")
    private Integer freePass;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;
    @CourseCode(value = "FIALA", message = "Must start with FIALA")
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getFreePass() {
        return freePass;
    }

    public void setFreePass(Integer freePass) {
        this.freePass = freePass;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}