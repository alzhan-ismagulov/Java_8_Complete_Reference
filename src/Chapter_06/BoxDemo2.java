package Chapter_06;

class Box2 {
    double with;
    double height;
    double depth;
}

public class BoxDemo2 {
    public static void main(String[] args) {
        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();
        double vol;
        //Присвоить значения переменным экземпляра mybox;
        mybox1.with = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //*присвоить другие значения переменным экземпляра mybox2 */
        mybox2.with = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //рассчитать объем первого параллепипеда
        vol = mybox1.with * mybox1.height * mybox1.depth;
        System.out.println("Объем равен " + vol);
        //рассчитать объем второго параллепипеда
        vol = mybox2.with * mybox2.height * mybox2.depth;
        System.out.println("Объем равен " + vol);
    }
}
