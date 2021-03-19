package com.podigua.service.impl;

import com.podigua.service.FxmlService;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author: podigua
 * @create: 2020-12-23 14:03
 **/
@Service
public class FxmlServiceImpl implements FxmlService {
    private final ApplicationContext applicationContext;

    public FxmlServiceImpl(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public <T extends Parent> T getByPath(String path){
        try {
            FXMLLoader loader = new FXMLLoader(new ClassPathResource(path).getURL());
            loader.setControllerFactory(clazz -> applicationContext.getBean(clazz));
            return loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
