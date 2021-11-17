import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Departamento[] dept = new Departamento[TipoDepartamento.values().length];
        dept[0] = new Departamento(TipoDepartamento.ADMINISTRATIVO);
        dept[1] = new Departamento(TipoDepartamento.RECURSOS_HUMANOS);
        dept[2] = new Departamento(TipoDepartamento.FINANCEIRO);
        dept[3] = new Departamento(TipoDepartamento.SETOR_COMERCIAL);

        // Cadastro de gerentes
        Empregado airton = new Empregado("948466", "Airton Palhares", (float)3000.00, dept[0]);
        dept[0].addEmpregado(airton);
        dept[0].setGerente(airton);
        Empregado marta = new Empregado("875757","Marta Sampaio", (float)3000.90, dept[1]);
        dept[1].addEmpregado(marta);
        dept[1].setGerente(marta);
        Empregado lucas = new Empregado("625353", "Lucas Gomes", (float)3000.90, dept[2]);
        dept[2].addEmpregado(lucas);
        dept[2].setGerente(lucas);
        Empregado tereza = new Empregado("23456", "Tereza Lima", (float)3000.90, dept[3]);
        dept[3].addEmpregado(tereza);
        dept[3].setGerente(tereza);

        while(true) {
            System.out.println("Cadastrar empregados: ");
            System.err.print("Digite o Nome: ");
            String nome = input.nextLine();
            System.err.print("Digite o CPF (somente dígitos): ");
            String cpf = input.next();
            System.out.print("Digite o salário: ");
            float salario = input.nextFloat();
            System.out.print("Código do departamento (0,1,2,3): ");
            byte d = input.nextByte();

            Empregado e = new Empregado(cpf, nome, salario, dept[d]);
            dept[d].addEmpregado(e);
            
            System.out.print("Deseja continuar? s/n ");
            String op = input.next();
            if(op.charAt(0) == 'n')
                break;

            input.nextLine();
        }


        int qtdDepartamentos = TipoDepartamento.values().length;

        for(int i = 0; i < qtdDepartamentos; i++) {
            System.out.println("\nEmpregados do Departamento " + i + ":");
            for(Empregado e : dept[i].getEmpregados()) {
                System.out.println(e);
            }
        }

        System.out.println("\nDepartamentos e gerentes: ");
        for(Departamento d : dept) {
            System.out.println("\n" + d);
        }

        input.close();
    }
}
