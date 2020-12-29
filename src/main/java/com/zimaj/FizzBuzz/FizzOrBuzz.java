package com.zimaj.FizzBuzz;

import java.util.ArrayList;

public class FizzOrBuzz {
    public FizzOrBuzz() {

    }

    public static ArrayList<String> result(long value) {
        ArrayList<String> list = new ArrayList<String>();

        for (int i=1; i<=value; i++) {
            
            if (i%3 == 0 && i%5 == 0) {
                list.add("FizzBuzz");
            }
            else if(i%3 == 0) {
                list.add("Fizz");
            }
            else if(i%5 == 0) {
                list.add("Buzz");
            }
            
        }
        return list;
    }
}
