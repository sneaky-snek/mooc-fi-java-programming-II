package myFirstApplication;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class MyFirstApplication extends Application {

    @Override
    public void start(Stage window) {
        Button buttonComponent = new Button("This is a button");

        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(buttonComponent);

        Scene view = new Scene(componentGroup);

        window.setScene(view);
        window.show();
    }
    public static void main(String[] args) {
    launch(MyFirstApplication.class);
    }

}
