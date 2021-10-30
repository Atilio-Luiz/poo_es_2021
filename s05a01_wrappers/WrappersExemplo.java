import java.util.Locale;

class WrappersExemplo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        byte v1 = Byte.parseByte("127");
        short v2 = Short.parseShort("2543");
        int v3 = Integer.parseInt("63542");
        long v4 = Long.parseLong("123456789");
        float v5 = Float.parseFloat("45.69823");
        double v6 = Double.parseDouble("23.46574849132987");
        boolean v7 = Boolean.parseBoolean("true");

        System.out.printf("%d %d %d %d %.5f %.14f %b%n",v1, v2, v3, v4, v5, v6, v7);
    }
}