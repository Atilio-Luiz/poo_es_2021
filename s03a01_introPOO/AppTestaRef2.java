public class AppTestaRef2 {
    public static void main(String[] args) {
        DataSimples c1 = new DataSimples();
        byte dia = 1, mes = 1;
        short ano = 2021;
        c1.inicializaDataSimples(dia, mes, ano);

        DataSimples c2 = new DataSimples();
        dia = 3; mes = 7; ano = 2022;
        c2.inicializaDataSimples(dia, mes, ano);

        if(c1 == c2) 
            System.out.println("Datas iguais");
        else   
            System.out.println("Datas diferentes");
    }
}