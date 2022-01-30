import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample02 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label welcomeLabel = new Label("Seja bem-vindo");
        Image image = new Image("quixada.jpg");
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(welcomeLabel);
        root.getChildren().add(new ImageView(image));

        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Bem-vindo!");
        stage.show();
    }
}
