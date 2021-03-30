package com.maryafolabi;

import java.util.ArrayList;
import java.util.List;

// this is all about the individual classrooms (i.e JSS1 - SS3)
    public class Classrooms {
    private String name;
    private List<String> listOfSubjects;
    // this constructor inherited from the field of Teachers initializes fields for classrooms


    public Classrooms(String name, int id) {
        this.name = name;
        listOfSubjects = new ArrayList<>();
    }

    public List<String> getListOfSubjects() {
        return listOfSubjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListOfSubjects(List<String> listOfSubjects) {
        this.listOfSubjects = listOfSubjects;
    }
}



