public class Socio {
    private String nome;
 
    public Socio(String nome) { 
        setNome(nome); 
    }
 
    public String getNome() { 
        return nome; 
    }
 
    public void setNome(String nome) {
       if (nome == null || nome.length() == 0) {
          throw new RuntimeException("Nome não pode ser nulo ou vazio.");
       }
       this.nome = nome;
    }

    public String toString() {
        return nome;
    }
 }