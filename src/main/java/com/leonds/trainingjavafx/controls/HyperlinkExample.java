package com.leonds.trainingjavafx.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * 超链接
 *
 * @author Leon
 */
public class HyperlinkExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // 基础样式
        Hyperlink link = new Hyperlink();
        link.setText("百度");

        // 设置字体样式
        Hyperlink link1 = new Hyperlink("百度");
        link1.setFont(Font.font("Courier New", FontWeight.BOLD, 36));

        // 点击打开网页
        Hyperlink link2 = new Hyperlink("点击跳转");
        link2.setOnAction(actionEvent -> {
            getHostServices().showDocument("http://www.baidu.com");
        });


        VBox root = new VBox();
        root.getChildren().add(link);
        root.getChildren().add(link1);
        root.getChildren().add(link2);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("超链接");
        primaryStage.show();

    }
}
