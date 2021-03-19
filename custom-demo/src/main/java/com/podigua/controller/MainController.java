package com.podigua.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.springframework.stereotype.Service;

/**
 * @author: podigua
 * @create: 2021-03-19 17:36
 **/
@Service
public class MainController {
    @FXML
    public Label text;

    public void click(ActionEvent event) {
        text.setText("hello JavaFX");
    }
}
