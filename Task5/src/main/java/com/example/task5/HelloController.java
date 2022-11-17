package com.example.task5;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Canvas canvas;

    @FXML
    protected void plusSmile_Click() {
        System.out.println("Welcome to JavaFX Application!");
    }
}