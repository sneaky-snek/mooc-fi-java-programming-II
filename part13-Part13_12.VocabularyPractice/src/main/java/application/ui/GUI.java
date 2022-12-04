package application.ui;

import application.logic.Dictionary;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class GUI extends Application {

    private Dictionary dictionary;

    @Override
    public void init() throws Exception {
        this.dictionary = new Dictionary();
    }


    @Override
    public void start(Stage window){

        PracticeView practiceView = new PracticeView(dictionary);
        InputView inputView = new InputView(dictionary);


        BorderPane mainLayout = new BorderPane();
        HBox buttons = new HBox();

        dictionary.add("","");


        buttons.setPadding(new Insets(10 ,20 ,20 ,20));
        buttons.setSpacing(10);

        Button addWord = new Button("Enter new words");
        Button practice = new Button("Practice");


        buttons.getChildren().addAll(addWord, practice);


        mainLayout.setTop(buttons);
        mainLayout.setPadding(new Insets(20, 20 ,20 , 20));


        addWord.setOnMouseClicked((event) -> mainLayout.setCenter(inputView.getView()));
        practice.setOnMouseClicked((event) -> mainLayout.setCenter(practiceView.getView()));

        mainLayout.setCenter(inputView.getView());

        Scene scene = new Scene(mainLayout, 400, 300);
        window.setScene(scene);
        window.show();

    }

    public void start(){
        launch(GUI.class);
    }


}
