package com.maryafolabi;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void canTakeCourse() {
        Person student = new Person("Kola", 16, 3, 100, "SS2");
    Assert.assertEquals(100, student.getScore());
    }
}
