package Chapter_04;

/**
 * Продемонстрировать применение операции инкремента ++
 */
public class IncDec {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        int d;
        int f = 1;
        c = ++b;
        d = a++;
        c++;
        ++f;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("f = " + f);
    }
}
