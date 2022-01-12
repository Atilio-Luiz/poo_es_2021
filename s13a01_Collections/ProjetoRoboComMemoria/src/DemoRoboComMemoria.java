public class DemoRoboComMemoria {
    public static void main(String[] args) throws Exception {
        RoboComMemoria rob5 = new RoboComMemoria("Rob5", 10, 10, (short)90);
        for(int movimento = 1; movimento <= 50; movimento++) {
            rob5.mudaDirecao((short)0); // para a esquerda
            rob5.move(movimento++);
            rob5.mudaDirecao((short)270); // para baixo
            rob5.move(movimento++);
            rob5.mudaDirecao((short)180); // Para direita
            rob5.move(movimento++);
            rob5.mudaDirecao((short)90); // para cima
            rob5.move(movimento++);
        }
        System.out.println(rob5.listaCaminho()); // qual foi o caminho percorrido?
        System.out.println(rob5); // onde o robô está?
        rob5.retornaABase(); // retorna à base
        System.out.println(rob5); // onde o robô está?
        //System.out.println(rob5.listaCaminho()); // qual foi o caminho percorrido?
    }
}
