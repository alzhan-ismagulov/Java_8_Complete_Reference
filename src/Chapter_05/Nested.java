package Chapter_05;

//Циклы могут быть вложенными
class Nested {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print(".");
                System.out.println();
            }

        }
    }
}
