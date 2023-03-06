import java.util.Scanner;

public class ATM_Projesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kAdi, kSifre;
        int kalanHak = 3, secim, tutar, bakiye = 1500;

        while (kalanHak > 0) {
            System.out.print("Kullanıcı Adı: ");
            kAdi = input.nextLine();
            System.out.print("Şifreniz: ");
            kSifre = input.nextLine();

            if(kAdi.equals("ayca") && kSifre.equals("123ayca")){
                System.out.println("Hesaba başarıyla giriş yaptınız.!");
                do {
                    System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
                    System.out.println("1-Para yatırma \n2-Para çekme \n3-Bakiye sorgulama \n4-Çıkış");
                    System.out.print("Seçiminiz : ");
                    secim = input.nextInt();
                    switch (secim){
                        case 1:
                            System.out.print("Para yatırmak istediğiniz tutarı giriniz : ");
                            tutar = input.nextInt();
                            bakiye += tutar;
                            System.out.println("Toplam bakiyeniz : " + bakiye);
                            break;
                        case 2 :
                            System.out.print("Para çekmek istediğiniz tutarı giriniz :");
                            tutar = input.nextInt();
                            if (tutar > bakiye){
                                System.out.println("Tutar bakiyeden fazla.\n İşlemi gerçekleştiremiyoruz.");
                            }else {
                                System.out.println("Çekilen tutar : " + tutar);
                                bakiye -= tutar;
                                System.out.println("Mevcut bakiyeniz : " + bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz : " + bakiye );
                            break;
                    }
                }while (secim != 4);
                System.out.println("Tekrar görüşmek üzere...");
                break;
            }else
                kalanHak --;
            if (kalanHak == 0){
                System.out.println("Hesabınız bloke olmuştur. Lütfen bankanız ile iletişime geçiniz");
            }else {
                System.out.println("Hatalı kullanıcı adı veya şifre. Yeniden deneyiniz.");
                System.out.println("Kalan Hakkınız : " + kalanHak);
            }
        }
    }
}

