package handson3;

public class foreach {
    public static void main(String[] args) {
        int[] bilangan = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int  himpunanAngka : bilangan) {
            if (himpunanAngka % 3 == 0 && himpunanAngka != 15) {
                continue;
            }
            System.out.println(himpunanAngka);
            if (himpunanAngka == 15) {
                break;
            }
        }
    }
}
