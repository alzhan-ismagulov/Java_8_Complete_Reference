package Chapter_03;

class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 2.0;
        //Динамическая инициализация переменной с
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза равна " + c);
    }
}
