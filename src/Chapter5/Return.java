package Chapter5;

//Продемонстрировать применение оператора return
class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("До возврата.");
        if (t) return;//Возврат в вызывающий код
        System.out.println("Этот оператор выполняться не будет");
    }
}
