public class while_loops {
    public static void main (String[] args) {
        int bozolicious = 64; //Set "bozolicious" top 64
        while (bozolicious != 1) {
            System.out.println(bozolicious);
            bozolicious /= 2;
        } // divides bozolicious by 2 until it reaches 1
    }
}
