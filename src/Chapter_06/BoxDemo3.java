package Chapter_06;

//В этой программе применяется метод, введенный в класс Box
class Box3 {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("Объем равен " + width * height * depth);
    }
}

class BoxDemo3 {
    public static void main(String[] args) {
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();
        //присвоить значение переменным экземпляра mybox;
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        /*присвоить другие значения переменным*/
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //вывести объем первого параллепипеда
        mybox1.volume();
        //вывести объем второго параллепипеда
        mybox2.volume();
    }
}
