package com.leonds.trainingjavafx.compontents.stage;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Stage 舞台，对应一个窗口
 *
 * @author Leon
 */
public class StageBasicExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // 设置标题
        stage.setTitle("HelloWorld");
        // 设置图标
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/assets/logo.png")));
        // 设置X坐标
        stage.setX(100);
        // 设置Y坐标
        stage.setY(100);
        // 设置宽度
        stage.setWidth(600);
        // 设置高度
        stage.setHeight(800);

        // 设置窗口样式，主要针对窗口的标题、最大化、最小化、关闭按钮
        stage.initStyle(StageStyle.UTILITY);

        stage.show();

    }
}
