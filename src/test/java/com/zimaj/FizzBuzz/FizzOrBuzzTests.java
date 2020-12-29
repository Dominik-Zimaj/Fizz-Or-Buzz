package com.zimaj.FizzBuzz;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.testng.Assert;

public class FizzOrBuzzTests {

    
    ArrayList<String> testList = new ArrayList<String>();

    @Test
    public void TestValue15() {

        
       String[] strs = {"Fizz", "Buzz", "Fizz", "Fizz", "Buzz", "Fizz","FizzBuzz"};
       
       testList.clear();
       for (int i=0; i<strs.length; i++) {
           testList.add(strs[i]);
           }
  
       Assert.assertEquals(testList, FizzOrBuzz.result(15));
       System.out.println("Test mit 15 erfolgreich");
        
    }

    @Test
    public void TestNotPositiveNumbers() {
        
        testList.clear();

        Assert.assertEquals(testList, FizzOrBuzz.result(0));
        System.out.println("Test mit 0 erfolgreich");
        Assert.assertEquals(testList, FizzOrBuzz.result(-68));
        System.out.println("Test mit negativer Zahl erfolgreich");
    
    }



    


}
