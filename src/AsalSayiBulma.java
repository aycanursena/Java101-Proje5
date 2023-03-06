public class AsalSayiBulma {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++){
            boolean asal = true;
            for (int m = 2; m < i; m++){
                if (i % m == 0){
                    asal = false;
                }
            }
            if (asal) {
                System.out.println(i);
            }
        }
    }
}