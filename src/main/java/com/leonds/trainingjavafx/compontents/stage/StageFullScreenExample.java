package com.leonds.trainingjavafx.compontents.stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 全屏 必须要有一个scene，否则看不到效果
 *
 * @author Leon
 */
public class StageFullScreenExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane anchorPane = new AnchorPane();

        Label label = new Label();
        label.setText("Hello World!");

        anchorPane.getChildren().add(label);

        Scene scene = new Scene(anchorPane);
        stage.setScene(scene);
        // 设置全屏
        stage.setFullScreen(true);

        stage.show();

    }
}
