package Chapter_06;

//В этой программе применяетс метод с параметрами
class Box5 {
    double width;
    double height;
    double depth;

    //Рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

    //Установить размеры параллепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo5 {
    public static void main(String[] args) {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        double vol;

        //инициализировать каждый экземплр класса Box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        //получить объем первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        //получить объем первого параллепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
