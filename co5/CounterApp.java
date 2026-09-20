import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CounterApp extends Application {
    private int count = 0;

    @Override
    public void start(Stage stage) {
        // Label to display current count
        Label countLabel = new Label("Count: 0");
        countLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        // Buttons for actions
        Button incrementButton = new Button("Increment");
        Button decrementButton = new Button("Decrement");
        Button resetButton = new Button("Reset");

        // Event handlers
        incrementButton.setOnAction(e -> {
            count++;
            countLabel.setText("Count: " + count);
        });

        decrementButton.setOnAction(e -> {
            count--;
            countLabel.setText("Count: " + count);
        });

        resetButton.setOnAction(e -> {
            count = 0;
            countLabel.setText("Count: 0");
        });

        // Arrange buttons horizontally
        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(incrementButton, decrementButton, resetButton);

        // Arrange root layout vertically
        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(countLabel, buttonBox);

        // Create scene and show stage
        Scene scene = new Scene(root, 350, 200);
        stage.setTitle("Counter Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
