import java.util.Scanner;

public class YildizlarElmasYapma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++){
            for (int k = 1; k <= (sayi - i); k++) {
                System.out.print(" ");
            }for (int j = 1; j <= (2 * i) - 1;j++){
                System.out.print("*");
            }System.out.println();
        }
        for (int a = 1; a < sayi; a++) {
            for (int s = 1; s <= a; s++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= (2 * sayi - (2 * a + 1)); m++) {
                System.out.print("*");
            }System.out.println();
        }
    }
}