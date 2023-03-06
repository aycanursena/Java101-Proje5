import java.util.Scanner;

public class HarmonikSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();
        double toplam = 0.0;

        for( double i = 1; i <= sayi; i++){
            toplam += (1 / i);
        }
        System.out.println("Sonuç : " + toplam);
    }
}