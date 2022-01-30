import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginWindow extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button okBtn = new Button("ok");
        grid.add(okBtn, 1,3);

        Scene scene = new Scene(grid, 350, 275);

        // inclusão do arquivo CSS no scene
        scene.getStylesheets().add(
            getClass().getResource("style/style.css").toExternalForm());
    
        primaryStage.setScene(scene);
        primaryStage.setMaxHeight(417);
        primaryStage.setMaxWidth(626);
        primaryStage.setMinHeight(275);
        primaryStage.setMinWidth(350);
        primaryStage.setTitle("Login Window");
        primaryStage.show();
    }
}
