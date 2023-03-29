package com.leonds.trainingjavafx.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * ImageView
 *
 * @author Leon
 */
public class ImageViewExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/assets/settings.png")));

        // 等比例压缩
        Image image2 = new Image(getClass().getResourceAsStream("/assets/image.png"), 300, 300, true, true);
        ImageView imageView2 = new ImageView(image2);

        VBox root = new VBox();
        root.getChildren().add(imageView);
        root.getChildren().add(imageView2);

        Scene scene = new Scene(root, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ImageView - 图像");
        primaryStage.show();

    }
}
