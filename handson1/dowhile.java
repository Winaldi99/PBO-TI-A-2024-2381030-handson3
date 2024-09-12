package handson1;

public class dowhile {
    public static void main(String[] args) {
        String[] kumpulanBuah = new String[] {"Apel", "Pisang", "Mangga", "Jeruk"};

        int i = 0;
        do {
            System.out.println(kumpulanBuah[i]);
            i++;
        } while (i < kumpulanBuah.length);
    }
}
