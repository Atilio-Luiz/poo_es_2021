/**
 * A classe Triangulo representa os três
 * lados de um triângulo qualquer
 */
class Triangulo {
    // declaração de um dos campos da classe
    float lado1;
    
    /**
     * O método equilátero verifica se o triângulo
     * é equilátero ou não
     * @return true se o triangulo é equilátero, false se não for
     */
    boolean éEquilátero() {
        if((lado1 == lado2) && (lado2 == lado3))
            return true;
        else
            return false;
    }

    /**
     * O método perímetro calcula o peŕimetro do
     * triângulo usando seus lados.
     * @return o perímetro do triângulo representado por esta classe
     */
    float perímetro() {
        return lado1 + lado2 + lado3;
    }

    /**
     * Declaração dos outros campos da classe
     */
    float lado2, lado3; // só para ilustrar.
                        // eles devem estar todos juntos
}