package Chapter_06;

class Box6 {
    double width;
    double height;
    double depth;

    //Это конструктор класса Box6
    Box6() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {
        //объявить, выделить память и инициализировать объекты типа Box
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();
        double vol;
        //Получить объем первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        //получить объем первого параллепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
