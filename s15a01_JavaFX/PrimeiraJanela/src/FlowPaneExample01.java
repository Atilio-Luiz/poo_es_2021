import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample01 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FlowPane root = new FlowPane();

        for(int i = 0; i < 100; i++) {
            Button btn = new Button(Integer.toString(i));
            root.getChildren().add(btn);

            btn.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Número = "+btn.getText());
                }
            });
        }

        Scene scene = new Scene(root, 300, 350);
        stage.setTitle("FlowPane Layout");
        stage.setScene(scene);
        stage.show();
    }
}
