package com.maryafolabi;

public class TeacherTakesCourseImplementation implements TeacherTeachesCourse{


    public void teachCourse(Person teacher) {
        if(teacher.getStaffLevel().equals("B2")) {
            System.out.println("Your students are waiting!");
        }
    }
}
