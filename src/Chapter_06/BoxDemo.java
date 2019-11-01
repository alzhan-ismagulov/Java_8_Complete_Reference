package Chapter_06;

/* Программа, использующая класс Box. Присвоить исходному файлу имя BoxDemo.java*/
class Box {
    double width;
    double height;
    double depth;
}
//В этом классе объвляетс объект типа Box

class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        //Присвоить значение переменным экземпляра myBox
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        //Рассчитать объем параллепипеда
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Объем равен " + vol);
    }
}
