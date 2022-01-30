import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    public static void main(String[] args){
        System.out.println("Começando...");
        launch(args);
        System.out.println("Terminando...");
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new VBox());
        stage.setScene(scene);
        stage.setTitle("Primeira Janela GUI!");
        stage.setWidth(500);
        stage.setHeight(600);
        stage.show();
    }
}