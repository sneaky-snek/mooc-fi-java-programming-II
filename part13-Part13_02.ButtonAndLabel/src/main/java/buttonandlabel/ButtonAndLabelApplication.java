package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application {

    public void start(Stage window){
        Button button = new Button("BUTTONTEST");
        Label label = new Label("LABEL");

        FlowPane flow = new FlowPane();
        flow.getChildren().add(button);
        flow.getChildren().add(label);


        Scene view = new Scene(flow);
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
