package com.honghu.jinhe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ExploreController {

    @FXML
    private Button backButton;

    // 处理返回按钮的点击事件
    @FXML
    protected void onBackButtonClick(ActionEvent event) {
        try {
            // 1. 获取当前舞台
            Stage currentStage = (Stage) backButton.getScene().getWindow();

            // 2. 加载欢迎页面的FXML文件
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("com/honghu/jinhe/welcome-view.fxml"));
            Parent root = fxmlLoader.load();

            // 3. 创建新场景并设置到当前舞台
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