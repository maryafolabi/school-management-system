package com.maryafolabi;

import org.junit.Assert;
import org.junit.Test;

public class PrincipalTest {

    @Test

    public void canExpelStudent(){
        Person student = new Person("Kola",16, 3,150,"SS3");{
            Person principal = new Person("Sola","A1",1);

            Assert.assertEquals(90, student.getScore());
        }
    }
}
