package com.leonds.trainingjavafx.compontents.stage;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Stage 窗口模式
 *
 * Modality
 *
 * @author Leon
 */
public class StageModalityExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        // 设置所有者为主窗口
        stage.initOwner(primaryStage);

        // 主窗口先显示
        primaryStage.show();

        stage.show();
    }
}
