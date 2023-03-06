import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();

        for (int a = 1; a <= sayi; a++) {
            for (int s = 1; s <= a; s++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= (2 * sayi - (2 * a - 1)); m++) {
                System.out.print("*");
            }System.out.println();
        }
    }
}