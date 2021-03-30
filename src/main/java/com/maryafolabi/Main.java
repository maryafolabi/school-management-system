package com.maryafolabi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person principal = new Person("Sola","A1",1);
        Person applicant = new Person("Tola", 15, 2, 250, "SS1");
        Person applicant2 = new Person("Bola", 6, 1, 150, "SS2");
        Person student = new Person("Kola",16, 3,150, "SS3");
        Person teacher = new Person("Mr Kunle","B2",2);
        School school = new School( "Loyola College");
        school.setPrincipal(principal);
        school.takeInApplicants(principal);
        school.setPassAgeMax(15);
        school.setPassAgeMin(10);
        school.setPassScore(100);
        school.addStudents(applicant, principal);
        school.addStudents(applicant2, principal);
        school.expelStudent(applicant, principal);
        school.expelStudent(applicant2, principal);
        StudentTakesCourseImplementation studentTakesCourseImplementation = new StudentTakesCourseImplementation();
        studentTakesCourseImplementation.takeCourse(student);
        TeacherTakesCourseImplementation teacherTakesCourseImplementation = new TeacherTakesCourseImplementation();
        teacherTakesCourseImplementation.teachCourse(teacher);

        System.out.println(school.getListOfStudents());
    }
}
