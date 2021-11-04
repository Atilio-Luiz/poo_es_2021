public class DemoArrayDeFloats {
    public static void main(String[] args) {
        ArrayDeFloats af = new ArrayDeFloats(25);
        for(int i = 0; i < af.tamanho(); i++) {
            af.modifica(i, 1.0f/i);
        }
        System.out.println(af);
        System.out.println("Maior valor: " + af.maiorValor());
        System.out.println("Menor valor: " + af.menorValor());
        System.out.printf("Na aposição %d: %f%n", 0, af.valor(0));
        System.out.printf("Na aposição %d: %f%n", 15, af.valor(15));
        System.out.printf("Na aposição %d: %f%n", 22, af.valor(22));

        float[] copia = af.paraArray();
        
        copia[0] = 23.45f; // cuidado, quebra o encapsulamento
        af.paraArray()[1] = 654.00f; // cuidado, quebra o encapsulamento

        System.out.println(af);
    }
}