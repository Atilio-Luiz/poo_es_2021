import java.util.Comparator;

public class NomeComparator implements Comparator<Pessoa> {
    public int compare(Pessoa a, Pessoa b) {
        String str1 = a.getNome();
        String str2 = b.getNome();
        return str1.compareTo(str2);
    }
}
