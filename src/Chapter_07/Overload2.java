package Chapter_07;

//Продемонстрировать перегрузку методов
class OverloadDemo2 {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    //    Перегружаемый метод, проверяющий наличие двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b = " + a + " " + b);
    }

    //    Перегружаемый метод, проверяющий наличие параметра double
    void test(double a) {
        System.out.println("Внутреннее преобразование при вызове " + " test(double) a: " + a);
    }
}

class Overload2 {
    public static void main(String[] args) {
        OverloadDemo2 ob = new OverloadDemo2();
        int i = 88;
//        вызвать все варианты метода test()
        ob.test();
        ob.test(10, 20);
        ob.test(i); //здесь вызывается вариант метода test(double)
        ob.test(123.2); //и здесь вызывается вариант метода test(double)
    }
}
