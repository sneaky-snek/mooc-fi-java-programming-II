package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application{

    @Override
    public void start(Stage window){
        GridPane layout = new GridPane();
        StackPane welcomeScreen = new StackPane();
        welcomeScreen.setAlignment(Pos.CENTER);


        Button startButt = new Button("Start");
        TextField nameArea = new TextField();

        layout.add(new Label("Enter your name and start."), 0 ,0);
        layout.add(nameArea, 0,1);
        layout.add(startButt, 0 ,2);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.setPrefSize(220, 100);


        welcomeScreen.setPadding(new Insets(20, 20, 20, 20));
        welcomeScreen.setPrefSize(220, 100);

        Scene loginLayout = new Scene(layout);
        Scene welcomed = new Scene(welcomeScreen);

        startButt.setOnAction((event) -> {
                welcomeScreen.getChildren().add(new Label("Welcome " + nameArea.getText() + "!"));
                window.setScene(welcomed);
                return;
        });

        window.setScene(loginLayout);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
