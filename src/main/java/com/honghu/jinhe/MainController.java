package com.honghu.jinhe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private Button compressButton;

    @FXML
    private Button analyzeButton;

    @FXML
    private Button settingsButton;

    @FXML
    private Button helpButton;

    @FXML
    private Button backButton;

    // 压缩功能按钮点击事件
    @FXML
    protected void onCompressButtonClick(ActionEvent event) {
        showAlert("压缩功能", "压缩功能暂未实现，敬请期待！");
    }

    // 数据分析按钮点击事件
    @FXML
    protected void onAnalyzeButtonClick(ActionEvent event) {
        showAlert("数据分析", "数据分析功能开发中...");
    }

    // 系统设置按钮点击事件
    @FXML
    protected void onSettingsButtonClick(ActionEvent event) {
        showAlert("系统设置", "设置功能即将推出！");
    }

    // 帮助文档按钮点击事件
    @FXML
    protected void onHelpButtonClick(ActionEvent event) {
        showAlert("帮助文档", "帮助文档正在编写中...");
    }

    // 返回欢迎页按钮点击事件
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
            showAlert("错误", "无法返回欢迎页面: " + e.getMessage());
        }
    }

    // 显示提示信息的通用方法
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}