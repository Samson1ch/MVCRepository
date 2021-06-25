package com.stkh.mvc;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    String CORRECT_OPERATION = "Your sentence:  ";
    String WRONG_OPERATION = "Wrong word! Repeat please! ";
    String ENTER_FIRST_WORD = "Enter first word: ";
    String ENTER_SECOND_WORD = "Enter second word: ";

    String HELLO = "Hello";
    String WORLD = "world!";

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setText(inputStrValueWithScanner(sc));
        view.printMessageResult(CORRECT_OPERATION, model.getText());

    }

    public String inputStrValueWithScanner(Scanner sc) {
        StringBuilder sb = new StringBuilder();

        view.printMessage(ENTER_FIRST_WORD);
        while (!sc.hasNext(HELLO)) {
            view.printMessage(WRONG_OPERATION);
            sc.next();
        }
        sb.append(sc.next());
        sb.append(" ");

        view.printMessage(ENTER_SECOND_WORD);
        while (!sc.hasNext(WORLD)) {
            view.printMessage(WRONG_OPERATION);
            sc.next();
        }
        sb.append(sc.next());

        return sb.toString();
    }

}
