package com.generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class MaximumTest {
       Maximum maximum;

    @Before
    public void setup() throws  Exception {
        maximum = new Maximum();
    }
    @Test
    public void Given_Max_Number_at_1st_Position_return_the_Same_Number() {
        Integer maximumResult=maximum.checkMaximum(5,4,3);
        Integer expected=5;
        Assert.assertEquals(expected,maximumResult);
    }
    @Test
    public void Given_Max_Number_at_2nd_Position_return_the_Same_Number(){
        Integer maximumResult=maximum.checkMaximum(4,5,3);
        Integer expected=5;
        Assert.assertEquals(expected,maximumResult);
    }
    @Test
    public void Given_Max_Number_at_3rd_Position_return_the_Same_Number() {
        Integer maximumResult=maximum.checkMaximum(3,4,5);
        Integer expected=5;
        Assert.assertEquals(expected,maximumResult);
    }

 @Test
    public void Given_Max_Float_at_1st_Position_return_the_Same_Float() {
        Float maximumResult=maximum.checkMaximum(5.5f,4.4f,3.3f);
        Float expectedResult=5.5f;
        Assert.assertEquals(expectedResult,maximumResult);
    }

    @Test
    public void Given_Max_Float_at_2nd_Position_return_the_Same_Float() {
        Float maximumResult=maximum.checkMaximum(4.4f,5.5f,3.3f);
        Float expectedResult=5.5f;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void Given_Max_Float_at_3rd_Position_return_the_Same_Float(){
        Float maximumResult=maximum.checkMaximum(4.4f,3.3f,5.5f);
        Float expectedResult=5.5f;
        Assert.assertEquals(expectedResult,maximumResult);
    }
}