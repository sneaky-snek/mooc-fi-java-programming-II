package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;


public class JokeApplication extends Application {


    @Override
    public void start(Stage window){
        BorderPane layout = new BorderPane();
        HBox hbox = new HBox();
        layout.setTop(hbox);


        layout.setPadding(new Insets(20,20,20,20));
        hbox.setSpacing(2);
        layout.setPrefSize(300,180);

        Button oneButt = new Button("Joke");
        Button twoButt = new Button("Answer");
        Button threeButt = new Button("Explanation");

        StackPane jokeView = createView("What do you call a bear with no teeth?");
        StackPane answerView = createView("A gummy bear.");
        StackPane explainView = createView("The bear has no teeth, only bare gum");

        hbox.getChildren().addAll(oneButt, twoButt, threeButt);

        layout.setCenter(jokeView);

        oneButt.setOnAction((actionEvent) -> layout.setCenter(jokeView));
        twoButt.setOnAction((event) -> layout.setCenter(answerView));
        threeButt.setOnAction((event) -> layout.setCenter(explainView));

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

    private StackPane createView(String s) {
        StackPane layout = new StackPane();
        layout.setPrefSize(300,180);
        layout.getChildren().add(new Label(s));
        layout.setAlignment(Pos.CENTER);
        return layout;
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
