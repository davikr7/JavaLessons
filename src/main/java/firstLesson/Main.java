package firstLesson;

public class Main {
    public static void main(String[] args) {

        // Математические операторы
        System.out.println("Математические операторы");

        int a = 5;
        int b = 10;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("--a = " + (--a));
        System.out.println("++a = " + (++a));
        System.out.println("a++ = " + (a++));
        System.out.println("a-- = " + (a--));


        // Логические операторы
        System.out.println("Логические операторы");

        int c = 3;
        int d = 7;
        System.out.println("c < d = " + (c < d));
        System.out.println("c > d = " + (c > d));
        System.out.println("c == d = " + (c == d));
        System.out.println("c >= d = " + (c >= d));
        System.out.println("c <= d = " + (c <= d));
        System.out.println("c != d = " + (c != d));


        // Переполнения при вычислениях
        System.out.println("Переполнения при вычислениях");

        int intNumber = 2147483647;
        byte byteNumber = 127;

        System.out.println((byte) (byteNumber + 1));
        System.out.println(intNumber + 1);

        // Вычисления комбинаций типов данных Int и Double
        System.out.println("Вычисления комбинаций типов данных Int и Double");

        int firstParam = 517;
        double secondParam = 79.9;

        System.out.println( "firstParam + secondParam: " + (firstParam + secondParam));
        System.out.println("firstParam - secondParam: " + (firstParam - secondParam));

    }
}