/**
 * A classe Conversao contém vários métodos estáticos que convertem
 * unidades de comprimento. Esta classe não tem atributos, e todos os seus
 * métodos são declarados como static, assim não é necessário criar instâncias
 * desta classe para usar os métodos. Para que os métodos possam ser acessados
 * de qualquer outra classe eles são declarados como public.
 */
public class Conversao {
    /**
     * O método polegadasParaCentimetros converte o valor passado em polegadas para centímetros.
     * @param polegadas o número de polegadas
     * @return o número de centímetros correspondente ao número de polegadas
     */
    public static double polegadasParaCentimetros(double polegadas) {
        double centimetros = polegadas * 2.54;
        return centimetros;
    }

    /**
     * O método pesParaCentimetros converte o valor passado em pés para centímetros.
     * @param pes o número de pés
     * @return o número de centímetros correspondente ao número de pés
     */
    public static double pesParaCentimetros(double pes) {
        double centimetros = pes * 30.48;
        return centimetros;
    }

    /**
     * O método converte o valor passado em milhas para quilômetros.
     * @param milhas o número de milhas
     * @return o número de quilômetros correspondente ao número de milhas
     */
    public static double milhasParaQuilometros(double milhas) {
        double quilometros = milhas * 1.609;
        return quilometros;
    }

}