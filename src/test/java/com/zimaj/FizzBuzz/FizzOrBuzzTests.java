package com.zimaj.FizzBuzz;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.testng.Assert;

public class FizzOrBuzzTests {

    
    ArrayList<String> testList = new ArrayList<String>();

    @Test
    public void TestValue15() {

        /*  In diesem Test wird eine Liste mit zu erwartenden Werten initialisiert und diese dann mit dem Ergebnis 
            aus der FizzOrBuzz Methode verglichen. Es wurde mit dem Eingabewert 15 getestet, da dieser alle drei möglichen Strings ausgibt. 
        */
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
        /*  In diesem Test wird die ArrayList geleert und mit der Ausgabe der Methode mit dem Eingabewert 0 und -68 verglichen.
            In beiden Fällen sollte die Ausgabe auch leer sein, da erst ab 1 die Fälle geprüft werden.   
        */
        testList.clear();

        Assert.assertEquals(testList, FizzOrBuzz.result(0));
        System.out.println("Test mit 0 erfolgreich");
        Assert.assertEquals(testList, FizzOrBuzz.result(-68));
        System.out.println("Test mit negativer Zahl erfolgreich");
    
    }



    


}
