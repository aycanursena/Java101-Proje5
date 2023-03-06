import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, k = 0, toplam = 0;
        System.out.print("Sayı giriniz : ");
        a = input.nextInt();

        for (int i = 0; i <= a; i++){
            if (i %3 == 0 && i %4 == 0){
                toplam += i;
                k++;
            }
        }

        if(k > 1){
            System.out.println("ortalama : " + toplam / k);
        }else
            System.out.println("Girilen sayı 3 ve 4'ün ortak katı değil.");
    }
}