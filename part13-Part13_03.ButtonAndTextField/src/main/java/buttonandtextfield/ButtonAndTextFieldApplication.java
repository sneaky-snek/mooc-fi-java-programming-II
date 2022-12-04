package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {

    public void start(Stage window){
        TextField text = new TextField("TEXTFIELD");
        Button button = new Button("This should be a button");

        FlowPane flowPane = new FlowPane();

        flowPane.getChildren().add(button);
        flowPane.getChildren().add(text);

        Scene scene = new Scene(flowPane);

        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
       launch(ButtonAndTextFieldApplication.class);
    }

}
