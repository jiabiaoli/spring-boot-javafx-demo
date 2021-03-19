package com.podigua.listener;

import com.podigua.event.StageReadyEvent;
import com.podigua.service.FxmlService;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * @author: podigua
 * @create: 2021-03-19 17:32
 **/
@Service
public class StageReadyListener implements ApplicationListener<StageReadyEvent> {

    private final FxmlService fxmlService;

    public StageReadyListener(FxmlService fxmlService) {
        this.fxmlService = fxmlService;
    }

    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        Stage stage = event.getStage();
        Parent parent = fxmlService.getByPath("/views/main.fxml");
        Scene scene=new Scene(parent,800,600);
        stage.setScene(scene);
        stage.setTitle("title");
        stage.sizeToScene();
        stage.show();
    }
}
