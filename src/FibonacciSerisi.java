import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int elemansayisi,a = -1,b = 1,c;

        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        elemansayisi = inp.nextInt();

        for (int i = 1 ;i <= elemansayisi; i++){
            c = a + b;
            System.out.print(b + " + " +  a  + " = " + c);
            a = b;
            b = c;
            System.out.println();

        }
    }
}
