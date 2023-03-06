import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0, basDegeri;

        System.out.println("Bir sayı giriniz : ");
        sayi = input.nextInt();

        while (sayi != 0){
            basDegeri = sayi % 10;
            toplam += basDegeri;
            sayi /= 10;
        }
        System.out.println("Toplam : " + toplam);
    }
}
