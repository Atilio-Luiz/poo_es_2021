import java.util.ArrayList;

public class Departamento {
    /**
     * Declaração dos atributos
     */
    private TipoDepartamento nomeDepartamento;
    private Empregado gerente;
    private ArrayList<Empregado> empregados = new ArrayList<Empregado>();

    /**
     * Construtor
     * @param nomeDepartamento o nome do departamento 
     */
    Departamento(TipoDepartamento nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public TipoDepartamento getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(TipoDepartamento nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public Empregado getGerente() {
        return gerente;
    }

    public void setGerente(Empregado gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Empregado> getEmpregados() {
        return empregados;
    }

    public void addEmpregado(Empregado empregado) {
        this.empregados.add(empregado);
    }

    public String toString() {
        return String.format("Nome do departamento: %s, Gerente: %s", 
            this.nomeDepartamento, this.gerente);
    }
}
