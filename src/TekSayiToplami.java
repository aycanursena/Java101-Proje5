import java.util.Scanner;

public class TekSayiToplami {
    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);

        int a, toplam = 0;
        do{
            System.out.print("Bir sayı giriniz : ");
            a = sayi.nextInt();
            if(a %2 == 0 && a %4 == 0){
                toplam += a;
            }
        }while(a %2 == 0);
        System.out.println("Toplam : " + toplam);
    }
}