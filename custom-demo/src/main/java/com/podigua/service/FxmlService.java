package com.podigua.service;

import javafx.scene.Parent;

/**
 * @author: podigua
 * @create: 2020-12-23 13:59
 **/
public interface FxmlService {
    /**
     * 路径
     *
     * @param path
     * @return
     */
    <T extends Parent> T getByPath(String path);
}
