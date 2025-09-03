package com.honghu.jinhe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // 添加调试代码开始
        URL resourceUrl = getClass().getClassLoader().getResource("com/honghu/jinhe/hello-view.fxml");

        FXMLLoader fxmlLoader = new FXMLLoader( getClass().getClassLoader().getResource("com/honghu/jinhe/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}