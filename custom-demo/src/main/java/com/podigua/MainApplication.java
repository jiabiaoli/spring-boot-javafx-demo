package com.podigua;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: podigua
 * @create: 2021-03-19 17:32
 **/
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        Application.launch(JavaFxApplication.class,args);
    }
}
