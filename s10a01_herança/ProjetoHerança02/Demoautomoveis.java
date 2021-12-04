import automoveis.TipoCombustivel;
import automoveis.Automovel;
import automoveis.AutomovelBasico;
import automoveis.AutomovelDeLuxo;

/**
 * A classe DemoAutomoveis, que demonstra instâncias das classes Automovel,
 * AutomovelBasico e AutomovelDeLuxo.
 */
public class Demoautomoveis {
    public static void main(String[] args) throws Exception {
        // Criamos uma instância da classe Automovel, cujo construtor 
        // somente recebe como argumentos o modelo, a cor e o combustível.
        Automovel a = new Automovel("Fusca","verde",TipoCombustivel.MOVIDOAALCOOL);

        // Executamos alguns métodos da classe Automovel
        System.out.println(a); // toString (implicitamente)
        System.out.println(a.quantoCusta());
        System.out.println(a.quantasPrestacoes());

        System.out.println();
        

        // Criamos uma instância da classe AutomovelBasico. 
        // Usamos o construtor que recebe como argumentos o modelo, 
        // a cor e o combustível (que serão repassados para o
        // construtor da classe ancestral), além de booleanos para 
        // representar a existência de retrovisores do lado do passageiro, 
        // limpador de pára-brisas e rádio AM/FM. A mesma classe tem 
        // um construtor que considera estes três acessórios como
        // existentes por default.
        AutomovelBasico ab = new AutomovelBasico("Corsa","cinza",
                            TipoCombustivel.MOVIDOAGASOLINA,true,true,false);

        // Executamos alguns métodos da classe AutomovelBasico
        System.out.println(ab); // toString (implicitamente)
        System.out.println(ab.quantoCusta());
        System.out.println(ab.quantasPrestacoes()); // método herdado, sem modificações

        System.out.println();
        
        // Criamos uma instância da classe AutomovelDeLuxo. 
        // Usamos o construtor que recebe como argumentos somente o modelo, 
        // a cor e o combustível (que serão repassados para o construtor 
        // da classe ancestral, em cascata). Este construtor considera
        // que todos os acessórios são instalados por default. 
        // A mesma classe tem um construtor que recebe valores booleanos 
        // indicando a existência ou não de cada um dos acessórios.
        AutomovelDeLuxo al = new AutomovelDeLuxo("Classe A","azul",
                                    TipoCombustivel.MOVIDOAGASOLINA);

        // Executamos alguns métodos da classe AutomovelDeLuxo
        System.out.println(al); // toString (implicitamente)
        System.out.println(al.quantoCusta());
        System.out.println(al.quantasPrestacoes()); // método superposto
        
    }   
}
