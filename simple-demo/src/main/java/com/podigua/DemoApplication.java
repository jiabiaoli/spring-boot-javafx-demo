package com.podigua;


import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author jiabiaoli
 */
@SpringBootApplication(scanBasePackages = "com.podigua")
public class DemoApplication extends AbstractJavaFxApplicationSupport {
    public static void main(String[] args) {
        launch(DemoApplication.class, DemoView.class,new DemoSplash(),args);
    }

    @Override
    public void beforeInitialView(Stage stage, ConfigurableApplicationContext ctx) {
        stage.setTitle("title");
        stage.setWidth(500);
        stage.setHeight(500);
    }
}
