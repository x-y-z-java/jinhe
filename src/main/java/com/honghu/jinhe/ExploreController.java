package com.honghu.jinhe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class ExploreController {

    @FXML
    private Button backButton;

    @FXML
    private ImageView backgroundImage;

    @FXML
    public void initialize() {
        // 绑定背景图片尺寸到舞台尺寸
        if (backgroundImage != null && backgroundImage.getScene() != null) {
            backgroundImage.fitWidthProperty().bind(backgroundImage.getScene().widthProperty());
            backgroundImage.fitHeightProperty().bind(backgroundImage.getScene().heightProperty());
        }
    }

    @FXML
    protected void onBackButtonClick(ActionEvent event) {
        try {
            Stage currentStage = (Stage) backButton.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("com/honghu/jinhe/welcome-view.fxml"));
            Parent root = fxmlLoader.load();

            Scene scene = new Scene(root, 640, 480);
            currentStage.setScene(scene);
            currentStage.setTitle("我的应用 - 欢迎");
            currentStage.centerOnScreen();

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("无法加载欢迎页面: " + e.getMessage());
        }
    }
}