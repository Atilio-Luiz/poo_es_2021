public class AppTestaRef {
    public static void main(String[] args) {
        DataSimples c1 = new DataSimples();
        byte dia = 1, mes = 1;
        short ano = 2021;
        c1.inicializaDataSimples(dia, mes, ano);

        DataSimples c2 = c1;
        c2.mes = 7;

        c1.mostraData();
        c2.mostraData();
    }
}