/**
 * Declaração de um tipo enumerado
 */
enum DiaDaSemana { DOMINGO, SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO };

/**
 * Classe de aplicação
 */
public class ExemploTeste {
    public static void main(String[] args) {
        // obtém um array de objetos a partir do método values()
        var arrayEnums = DiaDaSemana.values(); // uso recurso de inferência de tipos
                                               // para variáveis locais

        // Imprimir conteúdo do array
        System.out.print("Conteúdo do arrayEnums: ");
        for(int i = 0; i < arrayEnums.length; i++) {
            System.out.print(arrayEnums[i] + " ");
        }
        System.out.println();

        for(DiaDaSemana d : arrayEnums) {
            System.out.print(d.ordinal() + ": "); // a ordem do objeto na enumeração
            System.out.println(d); // invoca toString() implicitamente
        }

        DiaDaSemana d1 = DiaDaSemana.DOMINGO;
        DiaDaSemana d2 = DiaDaSemana.valueOf("DOMINGO");

        // Comparação com o método equals
        if(d1.equals(d2)) {
            System.out.println("d1 e d2 possuem o mesmo valor");
        }
        else {
            System.out.println("d1 e d2 são diferentes");
        }

        // Usando o operador de igualdade pra checar referências
        if(d1 == d2) {
            System.out.println("d1 e d2 referenciam o mesmo objeto");
        }
        else {
            System.out.println("d1 e d2 referenciam objetos distintos");
        }

        // Testando o método compareTo
        if(d1.compareTo(DiaDaSemana.TERÇA) < 0) {
            System.out.println(d1 + " vem antes de " + DiaDaSemana.TERÇA);
        }
        else{
            System.out.println(d1 + " vem depois de " + DiaDaSemana.TERÇA);
        }
    }
}