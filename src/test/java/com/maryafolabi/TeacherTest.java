package com.maryafolabi;


import org.junit.Assert;
import org.junit.Test;

public class TeacherTest {
    @Test

    public void canAdmitStudent() {
        Person applicant = new Person("Tola", 15, 2, 250,"SS1");
        {
            Person principal = new Person("Sola", "A1", 1);
            Assert.assertEquals( "A1", principal.getStaffLevel());

        }
    }
}