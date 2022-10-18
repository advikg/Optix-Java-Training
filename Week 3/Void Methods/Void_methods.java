public class Void_methods {
    public static void greater_than_10 (double number) {
        boolean bool = false;
        if (number > 10) {
            bool = true;
        }
        System.out.println(bool);
    }
    public static void main (String[] args) {
        greater_than_10(0.37);
        greater_than_10(49);
    }
}