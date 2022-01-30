import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calculator extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = 
            FXMLLoader.load(getClass().getResource("view/calculator2.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("view/style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
