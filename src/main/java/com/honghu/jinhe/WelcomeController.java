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

            // 2. 加载主界面的FXML文件
            // (假设主界面FXML文件名为 main-view.fxml，我们稍后创建)
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-view.fxml"));
            Parent root = fxmlLoader.load();

            // 3. 创建一个新的场景（Scene）并设置到当前舞台上
            Scene scene = new Scene(root, 640, 480);
            currentStage.setScene(scene);
            currentStage.setTitle("主界面");
            // 可选：居中显示
            currentStage.centerOnScreen();

        } catch (IOException e) {
            e.printStackTrace();
            // 在实际应用中，这里应该有一个更好的错误处理机制
            welcomeText.setText("加载主界面时出错！");
        }
    }
}