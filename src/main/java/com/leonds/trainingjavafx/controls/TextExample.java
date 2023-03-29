package com.leonds.trainingjavafx.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Leon
 */
public class TextExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // 基础文本
        Text text = new Text();
        text.setText("基础文本");

        // 设置字体 setFont
        Text text1 = new Text();
        text1.setText("带字体样式：微软雅黑，加粗，20");
        text1.setFont(Font.font("微软雅黑", FontWeight.BOLD, 20));

        // 设置字体颜色 setFill
        Text text2 = new Text();
        text2.setText("带颜色字体");
        text2.setFill(Color.BLUE);

        // 设置删除线 setStrikethrough
        Text text3 = new Text();
        text3.setText("带删除线");
        text3.setStrikethrough(true);

        // 设置下划线 setUnderline
        Text text4 = new Text();
        text4.setText("带下划线");
        text4.setUnderline(true);

        VBox root = new VBox();
        root.getChildren().add(text);
        root.getChildren().add(text1);
        root.getChildren().add(text2);
        root.getChildren().add(text3);
        root.getChildren().add(text4);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("文本");
        primaryStage.show();

    }
}
