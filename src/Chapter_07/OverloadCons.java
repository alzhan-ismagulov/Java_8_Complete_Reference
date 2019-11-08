package Chapter_07;

/**
 * В данном примере конструкторы определяются в классе Box для инициализации размеров параллепипеда тремя разными способами
 */
class Box {
    double width;
    double height;
    double depth;

    //Конструктор, используемый когда указываются все размеры
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //Конструктор, используемый когда ни один из размеров не указан
    Box() {
        width = -1; //-1 для обозначения инициализированного параллепипеда
        height = -1;
        depth = -1;
    }

    //Конструктор, испльзуемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    //Рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons {
    public static void main(String[] args) {
        //Создать параллепипеды, используя разные конструкторы
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

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
    }
}
