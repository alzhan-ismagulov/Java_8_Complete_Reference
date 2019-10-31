package Chapter5;

//Целевая часть цикла может быть пустой
public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;

        //Рассчитать среднее значение переменных i и j
        while (++i < --j) ; //У этого цикла отсутствует тело
        System.out.println("Среднее значение равно " + i);
    }
}
