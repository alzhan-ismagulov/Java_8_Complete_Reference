package Chapter5;

//Использовать символьные строки для управления оператором switch
public class StringSwitch {
    public static void main(String[] args) {
        String str = "три";
        switch (str) {
            case "один":
                System.out.println("один");
                break;
            case "два":
                System.out.println("два");
                break;
            case "три":
                System.out.println("три");
                break;
            default:
                System.out.println("не совпало");
                break;
        }
    }
}
