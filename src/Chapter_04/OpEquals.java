package Chapter_04;

/**
 * Продемонстрировать применение нескольких операций с присваиванием
 */
public class OpEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 1;
        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;
        d++;
        d = +1;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
