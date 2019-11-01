package Chapter_03;

/**
 * Вычислить расстояние, проходимое светом за указанное время, используя переменные типа long
 */
class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        //Приблизительная скорость света, миль в секунду
        lightspeed = 186000;
        days = 1000; //Указать количество дней
        seconds = days * 24 * 60 * 60; //Преобразовать в секунды
        distance = lightspeed * seconds; //Вычислить расстояние
        System.out.println("За " + days + " свет пройдёт около " + distance + " миль.");
    }
}
