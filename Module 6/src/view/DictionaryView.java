package view;

import controller.DictionaryController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application {

    private Label result = new Label("");
    private TextField wordField = new TextField();
    private DictionaryController controller;

    public void start(Stage stage) {
        Button searchButton = new Button("Search");
        FlowPane pane = new FlowPane();
        stage.setTitle("Dictionary");
        pane.getChildren().add(wordField);
        pane.getChildren().add(searchButton);
        pane.getChildren().add(result);

        searchButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String meaning = controller.search(wordField.getText());
                result.setText(meaning);
            }
        });

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    public void init() {
        controller = new DictionaryController();
    }
}