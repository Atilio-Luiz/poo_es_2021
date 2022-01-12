import java.util.HashSet;

/**
 * Classe que demonstra algumas operações em conjuntos (sets)
 */
public class OperacoesEmConjuntos {
    public static void main(String[] args) {
        // O conjunto de autores solteiros
        HashSet<String> solteiros = new HashSet<>();
        solteiros.add("Tom Christiansen");
        solteiros.add("Larry Wall");
        System.out.println("Solteiros: " + solteiros);

        // O conjunto de autores casados
        HashSet<String> casados = new HashSet<>();
        casados.add("Nathan Torkington");
        casados.add("Jeffrey Friedl");
        casados.add("Randal Schwartz");
        casados.add("Sriram Srinivasan");
        System.out.println("Casados: " + casados);

        // O conjunto de todos os tenistas
        HashSet<String> tenistas = new HashSet<>();
        tenistas.add("Tom Christiansen");
        tenistas.add("Larry Wall");
        tenistas.add("Jeffrey Friedl");
        System.out.println("Tenistas: " + tenistas);

        // O conjunto de todos os nadadores
        HashSet<String> nadadores = new HashSet<>();
        nadadores.add("Nathan Torkington");
        nadadores.add("Sriram Srinivasan");
        nadadores.add("Tom Christiansen");
        System.out.println("Nadadores: " + nadadores);

        // Demonstração de algumas operações
        // O conjunto de todos os autores
        HashSet<String> todos = new HashSet<>(casados); // inicializamos com os casados
        todos.addAll(solteiros); // adicionamos os solteiros

        // O conjunto de todos os nadadores e tenistas
        HashSet<String> nadadoresEtenistas = new HashSet<>(nadadores);
        nadadoresEtenistas.retainAll(tenistas); // retemos somente os tenistas
        System.out.println("\nNadadores e tenistas:");
        System.out.println(nadadoresEtenistas); // Tom

        // O conjunto dos que são tenistas e casados
        HashSet<String> tenistasCasados = new HashSet<>(tenistas);
        tenistasCasados.retainAll(casados); // retemos somente os casados
        System.out.println("\nTenistas casados:");
        System.out.println(tenistasCasados); // Jeffrey

        // O conjunto dos que são tenistas OU casados
        HashSet<String> tenistasOuCasados = new HashSet<>(tenistas);
        tenistasOuCasados.addAll(casados); // adicionamos (sem repetir) os casados
        System.out.println("\ntenistas OU casados:");
        System.out.println(tenistasOuCasados);

        // O conjunto dos que são casados mas não atletas
        HashSet<String> casadosMasNaoAtletas = new HashSet<>(casados);
        casadosMasNaoAtletas.removeAll(tenistas);
        casadosMasNaoAtletas.removeAll(nadadores);
        System.out.println("\nCasados que não são atletas:");
        System.out.println(casadosMasNaoAtletas); // Randal

        // Todo nadador é tenista? (isto é, o conjunto de tenistas
        // contém o conjunto de nadadores ?)
        System.out.print("\nTodo nadador é tenista? ");
        System.out.println(tenistas.containsAll(nadadores)); // false

        // Todo solteiro é tenista? (isto é, o conjunto de tenistas
        // contém o conjunto de solteiros?)
        System.out.print("\nTodo solteiro é tenista? ");
        System.out.println(tenistas.containsAll(solteiros)); // true
    }
}
