package Day03_Proje;

import java.util.Scanner;

public class AtmSorusu {

           /*
                 ATM
            Kullanicidan giriş için kart numarasi ve şifresini isteyin,
            eger herhangi birini yanlis girerse tekrar isteyin.
            Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
            Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,


            Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme,
            sifre değiştirme ve cikis islemleri olacaktır.


            Para çekme işleminde mevcut bakiyeden buyuk para çekilemez,

            Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
            eger değilse menü ekranina geri donsun.

            Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
            */

    static String kartNo = "123456";
    static String sifre = "1234";
    static double bakiye = 50000;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        giris();

    }

    private static void giris() {
        /*
            Kullanicidan giriş için kart numarasi ve şifresini isteyin,
            eger herhangi birini yanlis girerse tekrar isteyin.
            Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
            Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
         */

        System.out.print("KART NUMARASINI GİRİNİZ: ");
        String kKartno = scan.nextLine().replace(" ", "");
        System.out.print("SİFRENİZİ GİRİNİZ: ");
        String kSifre = scan.next();

        if (kKartno.equals(kartNo) && kSifre.equals(sifre)) {

            menu();
        } else {
            System.out.println("KULLANİCİ ADİ VEYA SİFRE YANLİS GİRİLDİ...");
            scan.nextLine(); // dummy --->ard arda scanner objesi kullanildiginda alınan hatayi engellemek icin kullandık
            giris();
        }
    }

    private static void menu() {
        // Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme,
        // sifre değiştirme ve cikis islemleri olacaktır.

        System.out.println("YAPMAK İSTEDİGİNİZ İSLEMİ SECİNİZ:\n" +
                "1.BAKİYE SORGULAMA\n" +
                "2.PARA YATİRMA\n" +
                "3.PARA CEKME\n" +
                "4.PARA GÖNDERME\n" +
                "5.SİFRE DEGISTIRME\n" +
                "6.CIKIS\n" +
                "SECİMİNİZ: ");

        int secim = scan.nextInt();

        switch (secim) {
            case (1): {
                // BAKİYE SORGULAMA
                bakiyeSorgula();
            }
            case (2): {
                // PARA YATİRMA
                System.out.print("YATIRMAK ISTEDIGINIZ MIKTARI GIRINIZ: ");
                double miktar = scan.nextDouble();
                paraYatirma(miktar);

            }

            case (3): {
                //PARA CEKME
                //Para çekme işleminde mevcut bakiyeden buyuk para çekilemez
                System.out.print("CEKMEK ISTEDIGINIZ MIKTARI GIRINIZ: ");
                double miktar = scan.nextDouble();
                paraCekme(miktar);

            }
            case (4): {
                // PARA GÖNDERME


                paraGonderme();


            }
            case (5):{
                // Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
                
                sifreDegistir();
            }
            case (6):{
                System.out.println("GULE GULE...");
                System.exit(0);

            }
            default:{
                System.out.println("HATALI GIRIS YATINIZ...");
                menu();
            }

        }

    }

    private static void sifreDegistir() {
        System.out.print("ESKI SIFRENIZI GIRINIZ: ");
        String eSifre=scan.next();
        if (eSifre.equals(sifre)){
            System.out.print("YENI SIFRE GIRINIZ: ");
            sifre=scan.next();
            scan.nextLine(); // dummy
            giris();
        }else {
            System.out.println("HATALI GIRIS YAPTINIZ...");
            sifreDegistir();
        }
    }

    private static void paraGonderme() {
        //Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
        //eger değilse menü ekranina geri donsun.
        scan.nextLine();
        System.out.print("PARA GONDERMEK ISTEDIGINIZ IBAN NUMARASINI GIRINIZ: ");
        String iban = scan.nextLine().toUpperCase().replace(" ", "");
        if (iban.length() == 26 && iban.startsWith("TR")) {
            System.out.print("GONDERMEK ISTEDIGINIZ MIKTARI GIRINIZ: ");
            double miktar = scan.nextDouble();
            if(miktar<=bakiye){
                System.out.println(miktar+" TL "+iban+" NOLU HESABA GONDERİLDİ");
                bakiye -=miktar;
                bakiyeSorgula();
            }else {
                System.out.println("CEKMEK ISTEDIGINIZ TUTARA SAHIP DEGILSINIZ...");


            }

        }else {
            System.out.println("HATALI IBAN GIRDINIZ...");
            paraGonderme();
        }
    }

        private static void paraCekme ( double miktar){
            // Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez
            if (miktar <= bakiye) {
                bakiye -= miktar;
                bakiyeSorgula();

            } else {
                System.out.println("CEKMEK ISTEDIGINIZ TUTARA SAHIP DEGILSINIZ...");
                menu();
            }

        }

        private static void paraYatirma ( double miktar){
            bakiye += miktar;
            bakiyeSorgula();
        }

        private static void bakiyeSorgula () {
            System.out.println("BAKİYENİZ:" + bakiye);
            menu();
        }
    }
