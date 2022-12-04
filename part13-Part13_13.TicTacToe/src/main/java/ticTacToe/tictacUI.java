//package ticTacToe;
//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.GridPane;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;


//
//public class tictacUI extends Application {
//
//    private String currentTurn;
//    private String[][] cells;
//    private int turns;
//    private Label turnIndicator;
//
//    @Override
//    public void init() throws Exception {
//        this.currentTurn = "X";
//        turns = 0;
//        cells = new String[3][3];
//        turnIndicator = new Label();
//
//        int i = 0;
//        while (i < 9) {
//            for (int x = 0; x < 3; x++) {
//                for (int y = 0; y < 3; y++) {
//                    cells[x][y] = " ";
//                    i++;
//                }
//            }
//        }
//    }
//
//    @Override
//    public void start(Stage window) {
//
//        BorderPane layout = new BorderPane();
//        turnIndicator.setFont(Font.font("Monospaced", 40));
//        layout.setPadding(new Insets(20, 20, 20, 20));
//        turnIndicator.setText("Turn: X");
//
//        GridPane buttonLay = new GridPane();
//        buttonLay.setPadding(new Insets(20, 20, 20, 20));
//        buttonLay.setHgap(10);
//        buttonLay.setVgap(10);
//
//
//        /////////////////////////////////////////// GRID BUTTONS, SORRY ////////////////////////////////////////////////
//
//        customButton btn00 = new customButton();
//        customButton btn01 = new customButton();
//        customButton btn02 = new customButton();
//        customButton btn10 = new customButton();
//        customButton btn11 = new customButton();
//        customButton btn12 = new customButton();
//        customButton btn20 = new customButton();
//        customButton btn21 = new customButton();
//        customButton btn22 = new customButton();
//
//        buttonLay.add(btn00, 0, 0);
//        buttonLay.add(btn01, 0, 1);
//        buttonLay.add(btn02, 0, 2);
//        buttonLay.add(btn10, 1, 0);
//        buttonLay.add(btn11, 1, 1);
//        buttonLay.add(btn12, 1, 2);
//        buttonLay.add(btn20, 2, 0);
//        buttonLay.add(btn21, 2, 1);
//        buttonLay.add(btn22, 2, 2);
//
//
//        if (!currentTurn.equals("The end!")) {
//            buttonLay.getChildren().forEach(item -> item.setOnMouseClicked(event -> {
//                updateTurn(item);
//                check(buttonLay);
//                turns++;
//            }));
//        }
//
//        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//        layout.setCenter(buttonLay);
//        layout.setTop(turnIndicator);
//
//        Scene scene = new Scene(layout);
//
//        window.setScene(scene);
//        window.show();
//    }
//
//    public void check(GridPane grid) {
//        if (turns < 4) {
//            return;
//        }
//
//        int i = 0;
//        while (i < 9) {
//            for (int x = 0; x < 3; x++) {
//                for (int y = 0; y < 3; y++) {
//                    if (cells[x][y].equals(" ")) {
//                        cells[x][y] = grid.getChildren().get(i).toString();
//                    }
//                    i++;
//                }
//            }
//        }
//
//
//
//        if (checkDiagonals() || checkRows() || checkColumns()){
//            currentTurn = "The end!";
//        }
//
//        // [0][3][6]   cells[0][0]  cells[1][0]  cells[1][0]
//        // [1][4][7]   cells[0][1]  cells[1][1]  cells[2][1]
//        // [2][5][8]   cells[0][2]  cells[1][2]  cells[2][2]
//
//    }
//
//    public void main() {
//        launch(tictacUI.class);
//    }
//
//    private void updateTurn(Object button) {
//        Button btn = (Button) button;
//
//        switch (currentTurn) {
//
//            case "X":
//                if (!btn.getText().equals(" ")) {
//                    return;
//                }
//                this.currentTurn = "O";
//                btn.setText("X");
//                turnIndicator.setText("Turn: " + currentTurn);
//                break;
//
//            case "O":
//                if (!btn.getText().equals(" ")) {
//                    return;
//                }
//                this.currentTurn = "X";
//                btn.setText("O");
//                turnIndicator.setText("Turn: " + currentTurn);
//
//                break;
//            case "The end!":
//                turnIndicator.setText("The end!");
//
//
//        }
//
//    }
//
//
//    public boolean checkRows() {
//
//        // im so sorry //
//
//        return ((!cells[0][0].equals(" ") && cells[0][0].equals(cells[1][0]) && cells[1][0].equals(cells[2][0])) ||
//                (!cells[0][1].equals(" ") && cells[0][1].equals(cells[1][1]) && cells[1][1].equals(cells[2][1])) ||
//                (!cells[0][2].equals(" ") && cells[0][2].equals(cells[1][2]) && cells[1][2].equals(cells[2][2])));
//
//    }
//
//    public boolean checkColumns() {
//        return ((!cells[0][0].equals(" ") && cells[0][0].equals(cells[0][1]) && cells[0][0].equals(cells[0][2])) ||
//                (!cells[1][0].equals(" ") && cells[1][0].equals(cells[1][1]) && cells[1][0].equals(cells[1][2])) ||
//                (!cells[2][0].equals(" ") && cells[2][0].equals(cells[2][1]) && cells[2][0].equals(cells[2][2])));
//    }
//
//
//    public boolean checkDiagonals(){
//        return ( (!cells[0][0].equals(" ") && cells[0][0].equals(cells[1][1]) && cells[0][0].equals(cells[2][2])) ||
//                 (!cells[0][2].equals(" ") && cells[0][2].equals(cells[1][1]) && cells[0][2].equals(cells[2][0])));
//    }
//
//
//}
