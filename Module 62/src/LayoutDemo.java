  import javafx.application.Application;
  import javafx.geometry.Insets;
  import javafx.scene.Scene;
  import javafx.scene.control.*;
  import javafx.scene.layout.*;
  import javafx.stage.Stage;

  public class LayoutDemo extends Application {

    @Override
    public void start(Stage stage) {
      VBox layout = new VBox(10);
      layout.setPadding(new Insets(15));

      TextField resultField = new TextField();
      resultField.setEditable(false);

      layout.getChildren().add(new Label("Enter an amount, choose both currencies, then press Convert."));
      layout.getChildren().add(new Label("Amount"));
      layout.getChildren().add(new TextField());
      layout.getChildren().add(new Label("From currency"));
      layout.getChildren().add(new ComboBox<String>());
      layout.getChildren().add(new Label("To currency"));
      layout.getChildren().add(new ComboBox<String>());
      layout.getChildren().add(new Button("Convert"));
      layout.getChildren().add(new Label("Result"));
      layout.getChildren().add(resultField);

      Scene view = new Scene(layout, 400, 450);
      view.getStylesheets().add("style.css");

      stage.setTitle("Currency Converter");
      stage.setScene(view);
      stage.show();
    }

    public static void main(String[] args) {
      launch(LayoutDemo.class);
    }
  }