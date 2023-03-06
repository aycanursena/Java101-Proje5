import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1, sayi2, ekok;

        System.out.print("Bir sayı giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("Bir sayı giriniz : ");
        sayi2 = input.nextInt();

        int ebob = 1;
        int k = 1;
        while (k <= sayi2) {
            if (sayi1 % k == 0 && sayi2 % k == 0) {
                ebob= k;
            }
            k++;
        }
        System.out.println("EBOB : " + ebob);

        int m = 1;
        while (m <= (sayi1 * sayi2)){
            if (m % sayi1 == 0 && m % sayi2 == 0){
                System.out.println("EKOK : " + m);
                break;
            }
            m++;
        }
    }
}
