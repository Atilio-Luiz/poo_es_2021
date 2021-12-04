import ufc.quixada.datahora.Data;
import ufc.quixada.pessoa.ChefeDeDepartamento;
import ufc.quixada.pessoa.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        ChefeDeDepartamento marcos = new ChefeDeDepartamento("Marcos Paiva", 
            24351279, 
            new Data((byte)3, (byte)4, (short)1999), 
            new Data((byte)5, (byte)10, (short)2019), 
            5050.0f, 
            "Finanças", 
            new Data((byte)5, (byte)10, (short)2021));
        
        System.out.println("nome: " + marcos.getNome());
        System.out.println("identidade: " + marcos.getIdentidade());
        System.out.println("data de nascimento: " + marcos.getNascimento());
        System.out.println("salário: " + marcos.getSalario());
        System.out.println("departamento: " + marcos.getDepartamento());
        //System.out.println("data de promoção: " + marcos.getDataPromocao());
        
        System.out.printf("%n%nExecução do método toString:%n");
        System.out.println(marcos); // toString implícito


        Pessoa p = new Pessoa("Maria", 4232323, 
            new Data((byte)2,(byte)4,(short)2010));

        System.out.println(p); // toString implícito
    }
}
