import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r, carpim_n = 1, carpim_r = 1, carpim_n_r = 1, kombinasyon;

        System.out.print("n değerini giriniz : ");
        n = input.nextInt();
        System.out.print("r değerini giriniz : ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++){
            carpim_n *= i;
        }
        for (int a = 1; a <= r; a++){
            carpim_r *= a;
        }
        for (int b = 1; b <= (n - r); b++){
            carpim_n_r *= b;
        }

        kombinasyon = carpim_n / (carpim_r * carpim_n_r);
        System.out.println("Kombinasyon : " + kombinasyon);
    }
}
