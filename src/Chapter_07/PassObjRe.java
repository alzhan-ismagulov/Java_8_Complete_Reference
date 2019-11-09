package Chapter_07;

/**
 * Объекты передаются по ссылке на них
 */
class Test3 {
    int a, b;

    //Конструктор класса Test3
    public Test3(int i, int j) {
        this.a = i;
        this.b = j;
    }

    //Передать объект
    void meth(Test3 o) {
        o.a *= 2;
        o.b /= 2;
    }
}

class PassObjRe {
    public static void main(String[] args) {
        Test3 ob = new Test3(15, 20);
        System.out.println("ob.a и ob.b до вызова: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
    }
}
