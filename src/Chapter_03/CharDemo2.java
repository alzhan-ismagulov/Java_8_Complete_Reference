package Chapter_03;

/**
 * Символьные переменные ведут себя как целочисленные значения
 */
class CharDemo2 {
    public static void main(String[] args) {
        char ch1;
        ch1 = 'Y';
        System.out.println("ch1 содержит " + ch1);
        ch1++; //Увеличить на единицу значение переменной ch1.
        System.out.println("ch1 теперь содержит " + ch1);
    }
}
