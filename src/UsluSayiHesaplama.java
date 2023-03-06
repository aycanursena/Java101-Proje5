import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int taban_sayi, kuvvet_sayi, sonuc = 1;
        System.out.print("Taban sayısını giriniz : ");
        taban_sayi = inp.nextInt();
        System.out.print("Kuvveti giriniz : ");
        kuvvet_sayi = inp.nextInt();

        for (int i = 1; i <= kuvvet_sayi; i++){
            sonuc *= taban_sayi;
        }
        System.out.println("Sonucunuz : " + sonuc);
    }
}
