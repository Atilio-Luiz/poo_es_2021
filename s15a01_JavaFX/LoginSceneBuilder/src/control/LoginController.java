package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

    @FXML
    private Button botaoLogin;

    @FXML
    private PasswordField campoSenha;

    @FXML
    private TextField campoUsuario;

    @FXML
    void fazerLogin(ActionEvent event) {
        String usuario = campoUsuario.getText();
        String senha = campoSenha.getText();
        if(usuario.equals("atilio") && senha.equals("345")) {
            System.out.println("Fez o login com sucesso");
        }
        else {
            System.err.println("Errou");
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText("Erro ao fazer login");
            alert.setContentText("Por favor, digite um login e senha válidos");
            alert.showAndWait();
        }
    }

}
