package com.podigua.event;

import javafx.stage.Stage;
import org.springframework.context.ApplicationEvent;

/**
 * @author: podigua
 * @create: 2021-03-19 17:38
 **/
public class StageReadyEvent extends ApplicationEvent {

    public StageReadyEvent(Stage stage) {
        super(stage);
    }

    public Stage getStage() {
        return (Stage) getSource();
    }
}
