import java.util.ArrayList;

public class Clube {
    private ArrayList<Socio> sociedade;
 
    public Clube() {
       sociedade = new ArrayList<>();
    }
 
    public void addSocio(Socio socio) {
       if (socio == null) {
          throw new RuntimeException("Sócio não pode ser nulo.");
       }
       sociedade.add(socio);
    }

    public int numeroDeSocios() { return sociedade.size(); }
    public Socio getSocio(int n) { return sociedade.get(n); }
    public Socio removeSocio(int n) { return sociedade.remove(n); }
 }
