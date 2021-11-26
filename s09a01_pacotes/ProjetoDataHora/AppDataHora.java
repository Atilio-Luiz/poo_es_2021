import ufc.quixada.datahora.Data;
import ufc.quixada.datahora.Hora;
import ufc.quixada.datahora.DataHora;
import java.time.LocalDateTime;
import java.util.Scanner;

public class AppDataHora {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        Hora meiodia = new Hora((byte)12, (byte)0, (byte)0);

        LocalDateTime ldt = LocalDateTime.now();
        byte dia = (byte) ldt.getDayOfMonth();
        byte mes = (byte) ldt.getMonthValue();
        short ano = (short) ldt.getYear();
        byte hora = (byte) ldt.getHour();
        byte min = (byte) ldt.getMinute();
        byte seg = (byte) ldt.getSecond();


        Data hoje = new Data(dia, mes, ano);
        DataHora agora = new DataHora(hora, min, seg, dia, mes, ano);
        
        System.out.println(meiodia);
        System.out.println(hoje);
        System.out.println(agora);
    }
}
