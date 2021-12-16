public class Pessoa implements Comparable<Pessoa> {
    private int id;
    private String nome;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }

    @Override public int compareTo(Pessoa p) {
        return Integer.compare(this.id, p.getId());
    }
    
    /*
    @Override public int compareTo(Pessoa p) {
        return this.nome.compareTo(p.nome);
    }
    */
    
    @Override public String toString() {
        return getClass().getName() + "[" + id + ":" + nome + "]";
    }
}