package Chapter_07;

/**
 * Простой пример рекурсии
 */
class Factorial {//объявление класса

    //это рекурсивный метод
    int fact(int n) {//метод
        int result;//создание переменной result
        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();//создание объекта
        System.out.println("Факториал 3 равен: " + f.fact(3));
        System.out.println("Факториал 4 равен: " + f.fact(4));
        System.out.println("Факториал 5 равен: " + f.fact(5));
    }
}
