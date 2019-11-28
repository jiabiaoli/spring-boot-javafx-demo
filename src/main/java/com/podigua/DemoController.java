package com.podigua;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;

@FXMLController
public class DemoController{
    @FXML
    private Button button;
    @Autowired
    private OpenView openView;
    @FXML
    public void click(ActionEvent event) {
        System.out.println("click");
        Parent parent = openView.getView();
        Scene scene= parent.getScene();
        if(scene==null){
            scene=new Scene(parent);
        }
        Stage stage =new Stage();
        stage.setScene(scene);
        stage.setWidth(200);
        stage.setHeight(200);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }
}
