package main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import module.ScreenManage;
import module.Sound;

public class Main extends Application {

    public static Stage primaryStage;
    public static Sound musicTrailer;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Main.primaryStage = primaryStage;
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        Parent root = FXMLLoader.load(getClass().getResource(
                "/view/ScreenLogo.fxml"));
        new Sound().Voice(Sound.LOGIN_WECOME);
        musicTrailer = new Sound();
        musicTrailer.Voice("NarutoWind.mp3");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        new ScreenManage().SplapScreen(Main.primaryStage, "Login.fxml", 4000,
                5000);
    }
}
