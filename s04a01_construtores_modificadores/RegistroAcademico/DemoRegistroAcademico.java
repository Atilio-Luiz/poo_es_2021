/**
 * A classe DemoRegistroAcademico demonstra o uso de 
 * instâncias da classe RegistroAcademico
 */
class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michel = new RegistroAcademico();
        RegistroAcademico roberto = new RegistroAcademico();
        michel.inicializaRegistro("Michel Santos", 34980030, (byte)2, 100.0);

        System.out.println("A mensalidade do " + 
            michel.getNomeDoAluno() + " é " + michel.calculaMensalidade());
        System.out.println("A mensalidade do " + 
            roberto.getNomeDoAluno() + " é " + roberto.calculaMensalidade());
    }
}