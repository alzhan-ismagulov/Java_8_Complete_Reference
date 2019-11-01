package Chapter_06;

//Теперь метода volume возвращает объем параллепипеда
class Box4 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo4 {
    public static void main(String[] args) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();
        double vol;

        //присвоить значение переменным экземпляра mybox;
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        /*присвоить другие значения переменным*/
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //Получить объем первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        //Получить объем второго параллепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
