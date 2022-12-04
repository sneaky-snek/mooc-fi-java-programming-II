package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window){
        BorderPane layout = new BorderPane();

        TextArea textArea = new TextArea();
        layout.setCenter(textArea);

        HBox bottomHbox = new HBox();
        bottomHbox.setSpacing(10);
        Label first = new Label("Letters: 0");
        bottomHbox.getChildren().add(first);
        Label second = new Label("Words: 0");
        bottomHbox.getChildren().add(second);
        Label third = new Label("The longest word is:");
        bottomHbox.getChildren().add(third);

        layout.setBottom(bottomHbox);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
