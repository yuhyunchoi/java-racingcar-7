package racingcar.controller;


import racingcar.view.InputView;

public class ApplicationController {

    private final InputView inputView;

    public ApplicationController(InputView inputView) {
        this.inputView = inputView;
    }

    public void run(){
        inputView.printInitialMessage();
    }
}
