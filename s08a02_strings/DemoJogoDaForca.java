public class DemoJogoDaForca {
    public static void main(String[] args) {
        JogoDaForca jogo = new JogoDaForca("miraculosamente");
        while(jogo.quantasLetrasAindaNãoAdivinhadas() > 0) {
            jogo.pergunta();
        }
    }
}