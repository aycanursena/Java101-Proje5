import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k;
        System.out.print("Bir sayı giriniz : ");
        k = input.nextInt();

        System.out.println("---- 4'ün kuvvetleri ----");
        for (int i = 1; i <= k; i *= 4){
            System.out.println(i);
        }
        System.out.println("---- 5'in kuvvetleri ----");
        for (int a = 1; a <= k; a *= 5){
            System.out.println(a);
        }
    }
}