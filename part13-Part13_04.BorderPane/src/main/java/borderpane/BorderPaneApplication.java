package borderpane;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application{

    public void start(Stage window){
        BorderPane layout = new BorderPane();
        layout.setBottom(new Label("SOUTH"));
        layout.setLeft(new Label("WEST"));
        layout.setRight(new Label("EAST"));
        layout.setTop(new Label("NORTH"));

        Scene view = new Scene(layout);

        window.setScene(view);

        window.show();

    }

    public static void main(String[] args) {

        launch(BorderPaneApplication.class);
    }
}
