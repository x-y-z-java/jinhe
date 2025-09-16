package com.honghu.jinhe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeController {

    @FXML
    private Label welcomeText;

    @FXML
    private Button startButton;

    @FXML
    private Button exploreButton;

    @FXML
    private ImageView backgroundImage;

    @FXML
    public void initialize() {
        // 设置欢迎文本
        welcomeText.setText("我们很高兴您选择我们的产品。\n点击下方按钮，开启精彩体验！");

        // 绑定背景图片尺寸到舞台尺寸
        if (backgroundImage != null && backgroundImage.getScene() != null) {
            backgroundImage.fitWidthProperty().bind(backgroundImage.getScene().widthProperty());
            backgroundImage.fitHeightProperty().bind(backgroundImage.getScene().heightProperty());
        }
    }

    // 处理"开始探索"按钮的点击事件
    @FXML
    protected void onStartButtonClick(ActionEvent event) {
        try {
            Stage currentStage = (Stage) startButton.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("com/honghu/jinhe/main-view.fxml"));
            Parent root = fxmlLoader.load();

            Scene scene = new Scene(root, 800, 600);
            currentStage.setScene(scene);
            currentStage.setTitle("我的应用 - 主功能界面");
            currentStage.centerOnScreen();

        } catch (IOException e) {
            e.printStackTrace();
            welcomeText.setText("加载主功能界面时出错！");
        }
    }

    // 处理跳转到探索页面的方法
    @FXML
    protected void onExploreButtonClick(ActionEvent event) {
        try {
            Stage currentStage = (Stage) exploreButton.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("com/honghu/jinhe/explore-view.fxml"));
            Parent root = fxmlLoader.load();

            Scene scene = new Scene(root, 600, 400);
            currentStage.setScene(scene);
            currentStage.setTitle("我的应用 - 探索功能");
            currentStage.centerOnScreen();

        } catch (IOException e) {
            e.printStackTrace();
            welcomeText.setText("加载探索页面时出错！");
        }
    }
}