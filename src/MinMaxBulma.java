import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi_adedi, girilenSayi, enBuyuk = 0, enKucuk = 0;

        System.out.print("Kaç tane sayı gireceksiniz : ");
        sayi_adedi = inp.nextInt();

        for (int i = 1; i <= sayi_adedi; i++) {
            System.out.print("Sayı giriniz : ");
            girilenSayi = inp.nextInt();
            if (i == 1){
                enBuyuk = girilenSayi;
                enKucuk = girilenSayi;
            }if (girilenSayi > enBuyuk) {
                enBuyuk = girilenSayi;
            }if (girilenSayi < enKucuk) {
                enKucuk = girilenSayi;
            }
        }
        System.out.println("En büyük sayı : " + enBuyuk);
        System.out.println("En küçük sayı : " + enKucuk);
    }
}