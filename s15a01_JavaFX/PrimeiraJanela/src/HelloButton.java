import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloButton extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button okButton = new Button("Olá");
        okButton.setPrefSize(400, 200);
        VBox pane = new VBox(okButton);
        
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("Primeiro Botão");
        stage.setHeight(300);
        stage.setWidth(500);
        stage.show();
    }
}
