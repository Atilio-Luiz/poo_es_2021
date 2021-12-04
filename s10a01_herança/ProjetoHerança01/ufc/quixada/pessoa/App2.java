package ufc.quixada.pessoa;

import ufc.quixada.datahora.*;

public class App2 {
    public static void main(String[] args) {
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
        System.out.println("data de promoção: " + marcos.getDataPromocao());
    }
}
