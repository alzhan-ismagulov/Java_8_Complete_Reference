package Chapter_07;

/**
 * Аргументы примитивных типов передаются по значению
 */
class Test2 {
    void metch(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test2 ob = new Test2();
        int a = 15, b = 20;
        System.out.println("a и b до вызова: " + a + " " + b);
        ob.metch(a, b);
        System.out.println("a и b после вызова: " + a + " " + b);
    }
}
