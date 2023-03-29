package com.leonds.trainingjavafx.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * Button 按钮
 *
 * @author Leon
 */
public class ButtonExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // 普通按钮
        Button button = new Button("按钮");

        // 设置按钮字体样式
        Button button1 = new Button("按钮");
        button1.setFont(Font.font("Courier New", FontWeight.BOLD, 36));

        // 设置默认按钮，使用回车默认触发的按钮
        Button button2 = new Button("默认按钮");
        button2.setDefaultButton(true);
        button2.setOnAction(actionEvent -> {
            System.out.println("点击了");
        });

        // 设置取消，使用ESC键会自动触发
        Button button3 = new Button("默认取消按钮");
        button3.setCancelButton(true);
        button3.setOnAction(actionEvent -> {
            System.out.println("点击了取消按钮");
        });

        // 助记符
        Button button4 = new Button();
        button4.setMnemonicParsing(true);
        button4.setText("_Click");
        button4.setOnAction(actionEvent -> {
            System.out.println("点击了 button4");
        });


        VBox root = new VBox();
        root.getChildren().add(button);
        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(button3);
        root.getChildren().add(button4);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Button - 按钮");
        primaryStage.show();

    }
}
