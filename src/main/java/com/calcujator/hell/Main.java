package com.calcujator.hell;

import com.calcujator.hell.entity.Display;
import com.calcujator.hell.entity.Keyboard;

public class Main {
    private static String text;

    public static void main(String[] args) {

        Display display = new Display();
        Keyboard keyboard = new Keyboard();

        display.show ("Hello world frodfsfsdfm display");
        double c = keyboard.vvod("Введите первое число: ", display);
        keyboard.vvod(text, display,c, keyboard);
        double b = keyboard.vvod("Введите второе число: ", display);
    }

}


