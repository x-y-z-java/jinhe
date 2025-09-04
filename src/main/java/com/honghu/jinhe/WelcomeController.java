package com.honghu.jinhe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeController {

    @FXML
    private Label welcomeText;

    @FXML
    private Button startButton;

    // 初始化方法，FXML加载后自动调用
    @FXML
    public void initialize() {
        // 可以在这里设置一些初始状态
        welcomeText.setText("我们很高兴您选择我们的产品。\n点击下方按钮，开启精彩体验！");
    }

    // 处理“开始探索”按钮的点击事件
    @FXML
    protected void onStartButtonClick(ActionEvent event) {
        try {
            // 1. 获取当前舞台（Stage）
            Stage currentStage = (Stage) startButton.getScene().getWindow();

            // 2. 加载主功能界面的FXML文件
            FXMLLoader fxmlLoader = new FXMLLoader( getClass().getClassLoader().getResource("com/honghu/jinhe/main-view.fxml"));
            Parent root = fxmlLoader.load();

            // 3. 创建一个新的场景（Scene）并设置到当前舞台上
            Scene scene = new Scene(root, 800, 600); // 设置更大的窗口尺寸
            currentStage.setScene(scene);
            currentStage.setTitle("我的应用 - 主功能界面");
            currentStage.centerOnScreen();

        } catch (IOException e) {
            e.printStackTrace();
            welcomeText.setText("加载主功能界面时出错！");
        }
    }

    // WelcomeController.java 中添加的新方法

    // 处理跳转到探索页面的方法
    @FXML
    protected void onExploreButtonClick(ActionEvent event) {
        try {
            // 1. 获取当前舞台
            Stage currentStage = (Stage) startButton.getScene().getWindow();

            // 2. 加载探索界面的FXML文件
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("com/honghu/jinhe/explore-view.fxml"));
            Parent root = fxmlLoader.load();

            // 3. 创建新场景并设置到当前舞台
            Scene scene = new Scene(root, 600, 400); // 可以设置不同的窗口大小
            currentStage.setScene(scene);
            currentStage.setTitle("我的应用 - 探索功能");
            currentStage.centerOnScreen();

        } catch (IOException e) {
            e.printStackTrace();
            welcomeText.setText("加载探索页面时出错！");
        }
    }
}