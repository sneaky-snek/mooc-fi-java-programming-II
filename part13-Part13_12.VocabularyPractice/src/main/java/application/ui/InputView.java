package application.ui;

import application.logic.Dictionary;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class InputView {
    private Dictionary dictionary;

    public InputView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public Parent getView(){
        GridPane layout = new GridPane();

        Button addButt = new Button("Add the word pair");
        TextField word = new TextField();
        TextField translation = new TextField();

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));


        layout.add(new Label("Word"), 0, 0);
        layout.add(word, 0, 1);
        layout.add(new Label("Translation"), 0, 2);
        layout.add(translation, 0, 3);

        layout.add(addButt, 0, 4);

        addButt.setOnAction((event) -> {
            String w = word.getText();
            String t =  translation.getText();

            dictionary.add(w,t);

            word.clear();
            translation.clear();
        });

        return layout;
    }
}


