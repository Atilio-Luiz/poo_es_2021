public enum Semana {
    DOM(1,"Domingo"), SEG(2,"Segunda"), TER(3,"Terça"),
    QUA(4,"Quarta"), QUI(5,"Quinta"), SEX(6,"Sexta"),
    SAB(7,"Sábado");

    // atributos
    private final int dia;
    private final String nome;

    // Construtor
    Semana(int dia, String nome) {
        this.dia = dia;
        this.nome = nome;
    }

    int getDia() { return dia; }
    String getNome() { return nome; }
}