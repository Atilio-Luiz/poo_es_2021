import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = 
            new FXMLLoader(getClass().getResource("view/layout.fxml"));
        Parent root = fxmlLoader.load();
        root.getStylesheets().add(
            getClass().getResource("view/style.css").toExternalForm());

        Scene scene = new Scene(root);

        primaryStage.setTitle("Janela de Login");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
