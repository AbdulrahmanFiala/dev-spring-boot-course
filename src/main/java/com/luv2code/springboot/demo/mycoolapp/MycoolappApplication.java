package com.luv2code.springboot.demo.mycoolapp;

import com.luv2code.springboot.demo.mycoolapp.dao.StudentDAO;
import com.luv2code.springboot.demo.mycoolapp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

//@SpringBootApplication(
//        scanBasePackages = {"com.luv2code.springboot.demo.mycoolapp","com.luv2code.util"}
//)
@SpringBootApplication
public class MycoolappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycoolappApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
//        return runner -> {
    //createStudent(studentDAO);
//            createMultipleStudents(studentDAO);
//            readStudent(studentDAO);
//            queryForStudnets(studentDAO);
//            queryForStudentByLastName(studentDAO);
//            updateStudent(studentDAO);
//            deleteStudent(studentDAO);
//            deleteAllStudents(studentDAO);
//        };
//    }

    private void deleteAllStudents(StudentDAO studentDAO) {
        System.out.println(studentDAO.deleteAll());
    }

    private void deleteStudent(StudentDAO studentDAO) {
        // retrieve student based on the id: primary key
        int studentId = 3;
        System.out.println("Deleting student ...");
        studentDAO.delete(studentId);
    }

    private void updateStudent(StudentDAO studentDAO) {
        // retrieve student based on the id: primary key
        int studentId = 1;
        System.out.println("Getting student with id " + studentId);

        Student myStudent = studentDAO.findById(studentId);

        System.out.println("Updating student ...");

        //change first name to "John"
        myStudent.setFirstName("John");
        studentDAO.update(myStudent);

        // display  updated student
        System.out.println(myStudent);

    }

    private void queryForStudentByLastName(StudentDAO studentDAO) {
        // get a list of students
        List<Student> theStudents = studentDAO.findByLastName("Doe");
        // get list of students
        for (Student tempStudent : theStudents) {
            System.out.println(tempStudent);
        }
    }

    private void queryForStudnets(StudentDAO studentDAO) {
        // get list of students
        List<Student> theStudents = studentDAO.findAll();

        // display list of students
        for (Student tempStudent : theStudents) {
            System.out.println(tempStudent);
        }
    }

    private void readStudent(StudentDAO studentDAO) {
        // Create a student object
        System.out.println("Creating new student object...");
        Student tempStudent = new Student("Duffy", "Duke", "daffy@luv2code");

        // Save the student object
        System.out.println("Saving the student ...");
        studentDAO.save(tempStudent);

        // display the id of the saved student
        System.out.println("Saved student. Generated id: " + tempStudent.getId());

        // retrieve Student based on the id: primary key
        System.out.println("\nRetrieving student with id: " + tempStudent.getId());

        Student myStudent = studentDAO.findById(tempStudent.getId());

        System.out.println("Found the student: " + myStudent);
    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        // create multiple students
        // create multiple object
        System.out.println("Creating 3 student objects ...");
        Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
        Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
        Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");

        // save the student objects
        System.out.println("Saving the students ...");
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);

    }

    private void createStudent(StudentDAO studentDAO) {
        // create the student object
        System.out.println("Creating new student objects ...");
        Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");
        //save the student object
        System.out.println("Saving the student ...");
        studentDAO.save(tempStudent);
        //display id of the saved student
        System.out.println("Saved student. Genereated id: " + tempStudent.getId());
    }
}









