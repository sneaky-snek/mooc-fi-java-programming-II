package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class MultipleViews extends Application {

    @Override
    public void start(Stage window){



        BorderPane first = new BorderPane();
        Scene firstScene = new Scene(first);
        first.setTop(new Label("First view!"));
        Button secondViewButt = new Button("To the second view!");
        first.setCenter(secondViewButt);

        VBox second = new VBox();
        Scene secondScene = new Scene(second);
        Button thirdViewButt = new Button("To the third view!");
        second.getChildren().add(thirdViewButt);
        second.getChildren().add(new Label("Second view!"));

        GridPane third = new GridPane();
        Scene thirdScene = new Scene(third);
        third.add(new Label("Third view!"), 0 , 0);
        Button returner = new Button("To the first View!");
        third.add(returner, 1,1);



        secondViewButt.setOnAction((actionEvent) -> {
                    window.setScene(secondScene);
        });

        thirdViewButt.setOnAction((event) -> {
            window.setScene(thirdScene);
        });
        returner.setOnAction((buttonPress) -> {
            window.setScene(firstScene);
        });

        window.setScene(first.getScene());
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
