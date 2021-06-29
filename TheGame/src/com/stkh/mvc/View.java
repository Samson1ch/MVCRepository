package com.stkh.mvc;

public class View {

    public void printMessage(String message){
        System.out.print(message);
    }

    public void printMessage(String message, int value){
        System.out.printf("%s %s.\n ", message, value);
    }

    public void printMessage(String message, int min, int max){
        System.out.printf("%s %s - %s.\n ", message, min, max);
    }

    public void printMessage(String message1, String message2, int min, int max){
        System.out.printf("%s %s %s - %s.\n ", message1, message2, min, max);
    }
}
