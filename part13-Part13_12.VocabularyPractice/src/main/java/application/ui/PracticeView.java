package application.ui;

import application.logic.Dictionary;
import javafx.geometry.Insets;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


import java.util.Random;

public class PracticeView {

    private Dictionary dictionary;
    private String[] word;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = dictionary.getRandomWord();
    }

    public Parent getView(){
       GridPane layout = new GridPane();

       this.word = dictionary.getRandomWord();
       Label question = new Label("Translate the word '" + word[0] + "'");
       TextField answerField = new TextField();
       Button checkButt = new Button("Check");

        Label feedback = new Label();


       layout.setPadding(new Insets(20, 20, 20,20));
       layout.add(question, 0,0);
       layout.add(answerField, 0, 1);
       layout.add(feedback, 0, 2);
       layout.add(checkButt, 0, 3);
       layout.setHgap(10);
       layout.setVgap(10);

       checkButt.setOnMouseClicked((event) -> {
           String answer = answerField.getText();
           String expectedAnswer = word[1];
           boolean correctAnswer = answer.equals(expectedAnswer);

           if(correctAnswer){
             feedback.setText("Correct!");
           } else {
               feedback.setText("Incorrect! expected answer was '" + expectedAnswer + "'");
           }

           word = dictionary.getRandomWord();
           question.setText("Translate the word '" + word[0] + "'");
           answerField.clear();
       });


        return layout;
    }
}

