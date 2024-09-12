package handson3;

public class forloop {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (i % 3 == 0 && i != 15) {
                continue;
            }
            System.out.println("Nilai I : " + i);
            if (i == 15) {
                break;
            }
        }
    }
}
