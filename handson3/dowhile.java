package handson3;

public class dowhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            if (i > 15) {
                break;
            }
            System.out.println("Nilai i : " + i);
            i++;
        } while (i <= 20);
    }
}
