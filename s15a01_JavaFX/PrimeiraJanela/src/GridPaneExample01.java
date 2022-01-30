import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GridPaneExample01 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane root = new GridPane();
        root.setVgap(10);
        root.setHgap(10);
        root.setPadding(new Insets(20));
        int i = 0, j = 0;

        for(i = 0; i < 10; i++)
            for(j = 0; j < 10; j++) {
                Button btn = new Button(j + "." + i);
                root.add(btn, i, j); // do not use getChildren as we set position
            }
        
        Text txt = new Text("Esta é uma grade");
        root.add(txt, 0, j, 10, 1); // start column, row; span column, row
        
        Scene scene = new Scene(root, 500, 370);
        stage.setTitle("GridPane Layout");
        stage.setScene(scene);
        stage.show();
    }
}
