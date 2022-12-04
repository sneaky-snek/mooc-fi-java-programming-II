package textstatistics;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.Arrays;

public class TextStatisticsApplication extends Application {


    @Override
    public void start(Stage window){

        BorderPane borderPane = new BorderPane();
        HBox hBox = new HBox();
        TextArea textField = new TextArea();

        Label letterAmount = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longestWord = new Label("The longest word is: ");

            textField.textProperty().addListener((change, oldValue, newValue) -> {
                    String[] parts = newValue.split(" ");
                    String longest = Arrays.stream(parts)
                            .sorted((s1, s2) -> s2.length() - s1.length())
                            .findFirst()
                            .get();

                    longestWord.setText("The longest word is: " + longest);


                    words.setText("Words: " + parts.length);
                    letterAmount.setText("Letters: " + newValue.length());
            });


        hBox.setSpacing(20);
        hBox.getChildren().add(letterAmount);
        hBox.getChildren().add(words);
        hBox.getChildren().add(longestWord);

        borderPane.setCenter(textField);
        borderPane.setBottom(hBox);


        window.setScene(new Scene(borderPane));
        window.show();

    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
