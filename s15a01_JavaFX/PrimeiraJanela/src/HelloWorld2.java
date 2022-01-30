import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorld2 extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new VBox());
        stage.setScene(scene);
        stage.setTitle("Primeira Janela GUI!");
        stage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("Começando...");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("Terminando...");
    }
}