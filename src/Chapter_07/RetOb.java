package Chapter_07;

//Возврат объекта
//Объявление класса
class Test4 {
    int a;

    //    Это конструктор
    public Test4(int i) {
        a = i;
    }

    //Это метод
    Test4 incrByTen() {
        Test4 temp = new Test4(a + 10);
        return temp;
    }
}

class RetOb {
    public static void main(String[] args) {
        Test4 ob1 = new Test4(2); //создание объекта ob1 и присвоение ему значения
        Test4 ob2; //создание переменной ob2

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после второго увеличения значения: " + ob2.a);
    }
}
