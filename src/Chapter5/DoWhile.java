package Chapter5;

//Продемонстрировать применение оператора цикла do-while
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("такт равно " + n);
            n--;
        } while (n > 0);
    }
}
