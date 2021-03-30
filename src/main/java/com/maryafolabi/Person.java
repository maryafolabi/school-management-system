package com.maryafolabi;


// this class is responsible for all that pertains to the people in my school

import java.util.List;

public class Person {
    private String name;
    private String staffLevel;
    private int age;
    private int id;
    private int score;
    private String classroom;

    // this constructor initializes the field of the class People

        public Person(String name, String staffLevel, int id) {

            this.name = name;
            this.staffLevel = staffLevel;
            this.id = id;
        }

        public Person(String name, int age, int id, int score, String classroom) {
            this.name = name;
            this.age = age;
            this.id = id;
            this.score = score;
            this.classroom = classroom;
        }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStaffLevel() {
        return staffLevel;
    }

    public void setStaffLevel(String staffLevel) {
        this.staffLevel = staffLevel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "[" + "name="+ name+ ", age= "+ age+ " id=" + id +"]";
    }
}
