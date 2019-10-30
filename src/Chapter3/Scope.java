package Chapter3;

/**
 * Продемонстировать область видимости блока кода
 */
class Scope {
    public static void main(String[] args) {
        int x; //Эта переменная доступна всему коду из метода main()
        x = 10;
        if (x == 10) { //начало новой области действия доступной только этому блоку кода
            int y = 20; //обе переменные х и у доступны только в этой области действия
            System.out.println("х и у: " + x + " " + y);
            x = y * 2;
        }
        //y = 100; MISTAKE! The variable y is not available in this scope, while the variable x is available here too
        System.out.println("x равно " + x);
    }
}
