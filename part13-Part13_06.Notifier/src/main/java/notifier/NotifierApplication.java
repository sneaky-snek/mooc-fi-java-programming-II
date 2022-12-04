package notifier;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public void start(Stage window) {
        TextField writeText = new TextField();
        Button button = new Button("Update");
        Label label = new Label();

        VBox pile = new VBox();
        pile.getChildren().add(writeText);
        pile.getChildren().add(button);
        pile.getChildren().add(label);

        button.setOnAction((actionEvent -> label.setText(writeText.getText())));

        Scene scene = new Scene(pile);

        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
