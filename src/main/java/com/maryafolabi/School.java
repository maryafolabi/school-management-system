package com.maryafolabi;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private Person principal;
    private List<Person> listOfTeachers;
    private List<Person> listOfStudents ;
    private String SS1;
    private Classrooms classroom;
    private List<Person>listOfApplicants;
    private List<Person> listOfNonAcademicStaffs;
    private int passScore;
    private int passAgeMax;
    private int passAgeMin;

    public School(String name) {
        this.name = name;
        listOfApplicants = new ArrayList<>();
        listOfStudents = new ArrayList<>();
        listOfNonAcademicStaffs = new ArrayList<>();
        listOfTeachers = new ArrayList<>();
    }

    public List<Person> getListOfStudents() {
        return listOfStudents;
    }



    public Person getPrincipal() {
        return principal;
    }

    public void setPrincipal(Person principal) {
        this.principal = principal;
    }

    public void setPassAgeMax(int passAgeMax) {
        this.passAgeMax = passAgeMax;
    }

    public void setPassAgeMin(int passAgeMin) {
        this.passAgeMin = passAgeMin;
    }

    public void setPassScore(int passScore) {
        this.passScore = passScore;
    }

    public int getPassScore() {
        return passScore;
    }

    public void expelStudent(Person student, Person principal){
        if(principal.getStaffLevel() != "A1") {
            System.out.println("You're not authorised to do this!");
            return;
        }
        if(!listOfStudents.contains(student)) {
            System.out.println("You ain't my student, who are you?");
            return;
        }
        if(student.getScore() <= passScore) {
            listOfStudents.remove(student);
            System.out.println("Better luck next time!");
            return;
        }
        if(student.getScore() > passScore) {
            System.out.println("The sky is your limit");
        }
    }
    public void takeInApplicants(Person applicant) {
        listOfApplicants.add(applicant);
}
    public void addTeachers (Person teacher) {
        listOfTeachers.add(teacher);
    }
    public void addStudents (Person applicant, Person principal){
        if(principal.getStaffLevel() != "A1"){
            System.out.println("Who the hell are you?");
            return;
        }
        if(! listOfApplicants.contains(applicant)){
            System.out.println("You don't belong here!");
            return;
        }
        if(applicant.getAge() <= passAgeMax && applicant.getAge() >= passAgeMin){
            listOfStudents.add(applicant);
            System.out.println("Yayyyy, you made it in!");
        }
    }

    public void addNonAcademicStaffs (Person nonAcademicStaff){
        listOfNonAcademicStaffs.add(nonAcademicStaff);
    }

}
