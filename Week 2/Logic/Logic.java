public class Logic {
    public static void main (String[] args) {
        int tea = 69;
        int candy = 420;
        int outcome;
        if (tea >= 5 && candy >=5) {
            if (tea >= (candy*2) || candy >= (tea*2)) {
                outcome = 2;
            }
            else {
                outcome = 1;
            }
        }
        else {
            outcome = 0;
        }
        System.out.println(outcome);
    }
}
