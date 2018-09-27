package com.calcujator.hell.entity;

import java.util.Scanner;

public class Keyboard {
    private double validator (String input){
        double answerValidator=0.0;
        try {
             answerValidator = Double.parseDouble(input);
        } catch ( Exception e){
         //  Methods methods = new Methods();
         //  methods.start(1, new Keyboard(), input);
        }

        //Double.parseDouble(input);
        return answerValidator;
    }
    public double vvod (String text, Display display){
        Scanner scanner =new Scanner(System.in);
        display.show(text);
        String linein = scanner.next();
        double answer = validator(linein);
        display.show("Результат " + answer);
        return answer;
    }
    public double vvod(String text, Display display, double a,Keyboard keyboard){
        return a;
    }
}
