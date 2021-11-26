public class ClasseLimitadaTeste {
    public static void main(String[] args) {
            ClasseLimitada obj1 = ClasseLimitada.getInstance();
            ClasseLimitada obj2 = ClasseLimitada.getInstance();
            ClasseLimitada obj3 = ClasseLimitada.getInstance();
            ClasseLimitada obj4 = ClasseLimitada.getInstance();
            ClasseLimitada obj5 = ClasseLimitada.getInstance();
            ClasseLimitada obj6 = ClasseLimitada.getInstance();
            ClasseLimitada obj7 = ClasseLimitada.getInstance();
            System.out.println(obj1);
            System.out.println(obj2);
            System.out.println(obj3);
            System.out.println(obj4);
            System.out.println(obj5);
            System.out.println(obj6);
            System.out.println(obj7);
    }
}