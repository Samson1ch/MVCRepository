package com.stkh.game;

import java.util.Random;
import java.util.Scanner;

public class Controller implements Data {
    private Scanner sc = new Scanner(System.in);

    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public int rand(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public void processUser() {
        int answer = rand(MIN_VALUE, MAX_VALUE);
        System.out.println(answer);
        int numb, min = 0, max = 0;

        view.printMessage(THE_NUMBER, MIN_VALUE, MAX_VALUE);

        do {
            view.printMessage(TRY_TO_GUESS);
            numb = sc.nextInt();
            model.setElemOfRange(numb);

            if (numb == answer) {
                view.printMessage(YOU_WIN);
            } else if (numb < answer) {
                min = numb;
                view.printMessage(NUMB_IN_RANGE, min, max);
            } else if (numb > answer) {
                max = numb;
                view.printMessage(NUMB_IN_RANGE, min, max);
            } else {
                view.printMessage(ERROR);
                view.printMessage(NUMB_IN_RANGE, min, max);
            }
        } while (answer != numb);
    }
}
