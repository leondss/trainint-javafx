package com.leonds.trainingjavafx.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Label 标签
 *
 * @author Leon
 */
public class LabelExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // basic
        Label label = new Label("姓名");

        // 设置图片，默认显示在文字的左边，垂直居中对齐
        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/assets/settings.png")));
        Label label1 = new Label("设置", imageView);

        VBox root = new VBox();
        root.getChildren().add(label);
        root.getChildren().add(label1);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Label - 标签");
        primaryStage.show();

    }
}
