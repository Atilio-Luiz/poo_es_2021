enum Season {
    SPRING, SUMMER, FALL, WINTER;
}

public class SeasonsTest {
    public static void main(String[] args) {
        Season s1 = Season.FALL;
        Season s2 = Season.valueOf("WINTER");
        Season s3 = Season.valueOf("FALL");

        System.out.printf("%s%n%s%n%s%n", s1, s2, s3);

        if(s1 == s3)
            System.out.println("s1 e s3 são iguais");
        else 
            System.out.println("s1 e s3 são diferentes");
    }
}