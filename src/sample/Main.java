package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Stack;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        StackPane root = new StackPane();
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        TextField text = new TextField();
        text.setAlignment(Pos.CENTER);
        grid.add(text, 0, 1);

        Button przycisk = new Button();
        przycisk.setText("   Jestem sobie przycisk  ");
        przycisk.setAlignment(Pos.BOTTOM_CENTER);
        grid.add(przycisk, 0, 2);
        final Text wynik = new Text();
        grid.add(wynik, 0, 3);
        przycisk.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                wynik.setText(text.getText());
            }
        });


        primaryStage.setTitle("Hello pierwsze koty za ploty ");
        primaryStage.setScene(new Scene(grid, 300, 275));


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
