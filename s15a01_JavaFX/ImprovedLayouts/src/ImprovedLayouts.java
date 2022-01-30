import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ImprovedLayouts extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12)); // padding all around
        hbox.setSpacing(10); // space between nodes
        hbox.setStyle("-fx-background-color: #336699;"); // familiar?
        
        Button buttonCurrent = new Button("Button 1");
        buttonCurrent.setPrefSize(100, 20); // preferred size
        
        Button buttonTwo = new Button("Button 2");
        buttonTwo.setPrefSize(100, 20);
        buttonTwo.setStyle("-fx-color: #00bb00;");
        
        hbox.getChildren().addAll(buttonCurrent, buttonTwo);

        HBox hbox2 = new HBox();
        hbox2.setStyle("-fx-background-color: #880000;");
        
        BorderPane root = new BorderPane();
        root.setTop(hbox); // a Pane added to another Pane
        root.setCenter(hbox2); // center occupies all the remaining region
        
        Scene scene = new Scene (root, 300, 300);
        primaryStage.setTitle("Complex Window!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
