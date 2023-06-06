package com.example.main;

import javafx.application.Platform;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class OpenController {

    private Stage stage;

    public void onExitButton(MouseEvent event){
        Platform.exit();
        System.exit(0);
    }


    public void setStage(Stage stage) {
        stage =stage;
    }
}