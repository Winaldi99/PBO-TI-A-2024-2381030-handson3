package handson1;

public class whileloop {
    public static void main(String[] args) {
        String[] kumpulanBuah = new String[] {"Apel", "Pisang", "Mangga", "Jeruk"};

        int i = 0;
        while (i < kumpulanBuah.length) {
            System.out.println(kumpulanBuah[i]);
            i++;
        }
    }
}
