package com.zimaj.FizzBuzz;

import java.util.ArrayList;

public class FizzOrBuzz {
    public FizzOrBuzz() {

    }

    public static ArrayList<String> result(long value) {
        ArrayList<String> list = new ArrayList<String>();

        for (int i=1; i<=value; i++) {
            
            /*  Zuallererst wird geprüft ob die Eingabe durch beide Zahlen teilbar ist und falls nicht ob eine der beiden teilbar ist.
                Drei reine IF Abfragen sind hier ungünstig, da mehrere Fälle zutreffen können und dadurch ungünstigerweise mehrmals die
                list.add() Funktion ausgeführt wird. Ein Else muss nicht berücksichtigt werden, da in diesem Fall einfach nur der nächste
                Wert ausgegeben werden soll.
            */  
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
