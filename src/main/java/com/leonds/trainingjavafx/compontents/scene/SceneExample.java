package com.leonds.trainingjavafx.compontents.scene;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Scene 场景
 *
 * @author Leon
 */
public class SceneExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane pane = new AnchorPane();
        Label label = new Label();
        label.setText("Hello World");

        pane.getChildren().add(label);

        Scene scene = new Scene(pane);
        scene.setCursor(Cursor.WAIT);

        stage.setScene(scene);

        stage.setWidth(800);
        stage.setHeight(600);
        stage.centerOnScreen();
        stage.show();

    }
}
