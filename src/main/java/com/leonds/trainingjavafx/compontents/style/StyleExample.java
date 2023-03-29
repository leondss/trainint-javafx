package com.leonds.trainingjavafx.compontents.style;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Style
 *
 * @author Leon
 */
public class StyleExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // 设置标题
        stage.setTitle("CSS Demo");
        // 设置宽度
        stage.setWidth(600);
        // 设置高度
        stage.setHeight(800);
        stage.centerOnScreen();


        AnchorPane pane = new AnchorPane();

        Button button = new Button();
        button.setText("提 交");
        button.getStyleClass().add("btn-submit");

        pane.getChildren().add(button);

        Scene scene = new Scene(pane);
        scene.getStylesheets().add("assets/style.css");

        stage.setScene(scene);

        stage.show();

    }
}
