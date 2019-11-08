package Chapter_07;

/**
 * В этой версии класса Box один объект допускается инициализировать другим объектом
 */
class Box2 {
    double width;
    double height;
    double depth;

    //Обратите внимание на этот конструктор. В качестве параметра в нем используется отбъект типа Box
    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //Конструктор, используемый когда указываются все параметры
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //Конструктор, используемый когда ни один из размеров не указан
    Box2() {
        width = -1; //-1 для обозначения инициализированного параллепипеда
        height = -1;
        depth = -1;
    }

    //Конструктор, испльзуемый при создании куба
    Box2(double len) {
        width = height = depth = len;
    }

    //Рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons2 {
    public static void main(String[] args) {
        //Создать параллепипеды, используя разные конструкторы
        Box2 mybox1 = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2();
        Box2 mycube = new Box2(7);

        Box2 myclone = new Box2(mybox1);

//Создать копию объекта mybox1;
        double vol;

        //Получить объем первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        //Получить объем второго параллепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        //Получить объем куба
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);

        //Получить объем клона
        vol = myclone.volume();
        System.out.println("Объем myclone равен " + vol);
    }
}
