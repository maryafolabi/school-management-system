package com.maryafolabi;

import java.util.List;

public class StudentTakesCourseImplementation implements StudentTakesCourse{
    private List<Person> listOfStudents ;



    public void takeCourse(Person student) {
        if(listOfStudents.contains(student)) {
            System.out.println("Get to your class now!");

        }

    }
}