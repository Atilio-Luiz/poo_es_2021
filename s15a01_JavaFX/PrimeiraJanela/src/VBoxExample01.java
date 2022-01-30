import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample01 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label descriptionLabel = 
            new Label("Some Buttons");
        Button okButton = new Button("Ok");
        Button cancelButton = new Button("Cancel");

        VBox root = new VBox();

        root.getChildren().addAll(descriptionLabel, 
            okButton, cancelButton);

        Scene scene = new Scene(root, 250, 100);
        stage.setScene(scene);
        stage.setTitle("Bem-vindo!");
        stage.setResizable(true);
        stage.setMaxHeight(600);
        stage.setMaxWidth(600);
        stage.setMinHeight(100);
        stage.setMinWidth(100);
        stage.show();
    }
}