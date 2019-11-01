package Chapter_06;

/*в данном примере программы для инициализации размеров
параллепипеда в классе Box7 применяется параметризированный конструктор
 */
class Box7 {
    double width;
    double height;
    double depth;

    //Это конструктор класса Box7
    Box7(double w, double h, double d) {
        System.out.println("Конструирование объекта Box7");
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        //объявить, выделить память и инициализировать объекты типа Box
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);
        double vol;
        //Получить объем первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        //получить объем первого параллепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
