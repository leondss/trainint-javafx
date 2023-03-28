package com.leonds.trainingjavafx.compontents.stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 * Stage 事件
 *
 * @author Leon
 */
public class StageEvents extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("HelloWorld");
        Label label = new Label("Hello World, JavaFX !");
        Scene scene = new Scene(label, 400, 200);

        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(windowEvent -> {
            System.out.println("OnClose");
        });

        stage.setOnHiding(windowEvent -> {
            System.out.println("OnHiding");
        });

        stage.setOnHidden(windowEvent -> {
            System.out.println("OnHidden");
        });

        stage.setOnShowing(windowEvent -> {
            System.out.println("OnShowing");
        });

        stage.setOnShown(windowEvent -> {
            System.out.println("OnShown");
        });

        // 键盘事件
        stage.addEventHandler(KeyEvent.KEY_PRESSED, (event) -> {
            System.out.println("Key pressed: " + event.toString());

            switch (event.getCode()) {
                case ESCAPE: { // 27 = ESC key
                    stage.close();
                    break;
                }
                case SPACE: { // 10 = Return
                    stage.setWidth(stage.getWidth() * 2);
                }
                default: {
                    System.out.println("Unrecognized key");
                }
            }
        });
    }
}
