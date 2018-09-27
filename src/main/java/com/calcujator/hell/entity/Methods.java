package com.calcujator.hell.entity;

public class Methods {
    public double start(double a, Keyboard b, String line) {
        if (validator(line)) {
            System.out.println("можем");
        } else {
            System.out.println("не можем");
        }
        return 0.0;
    }

    private boolean validator(String line) {
        line.length();
        if (line.length() == 1) {
            if (line == "+") {
                return true;
            }
            if (line == "-") {
                return true;
            }
            if (line == "/") {
                return true;
            }
            if (line == "*") {
                return true;
            }
            if (line == "=") {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}
