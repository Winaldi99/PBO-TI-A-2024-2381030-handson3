package handson3;

public class foreach {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            if ( i >= 15) {
                break;
            }
            System.out.println("Nilai i : " + i);
        }
    }
}
