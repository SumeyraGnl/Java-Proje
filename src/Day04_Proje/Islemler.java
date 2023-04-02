package Day04_Proje;

import java.util.List;
import java.util.Scanner;

public class Islemler {

    Scanner scan = new Scanner(System.in);
    Ogrenci ogrenci;

    int numara=1000;

    void menu(List<Ogrenci> ogrList) {
        System.out.println("============= İŞLEMLER =============\n" +
                "             1-EKLEME\n" +
                "             2-LISTELEME\n" +
                "             3-ARAMA\n" +
                "             4-SİLME\n" +
                "             Q-ÇIKIŞ\n" +
                "\n" +
                "        SEÇİMİNİZ:");

        char secim = scan.next().toUpperCase().charAt(0);

        switch (secim) {
            case '1': {
                ekleme();
            }
            case '2': {
            }
            case '3': {
            }
            case '4': {
            }
            case 'Q': {
            }


        }

    }

    private void ekleme() {
        System.out.println("OGRENCININ ADINI GIRINIZ: ");
        String ad = scan.nextLine();
        System.out.println("OGRENCININ SOYADINI GIRINIZ: ");
        String soyad = scan.nextLine();
        System.out.println("OGRENCININ TC NO SUNU GIRINIZ:  ");
        String tcNo = scan.next();
        System.out.println("OGRENCININ YASINI GIRINIZ:  ");
        int yas = scan.nextInt();
        System.out.println("OGRENCININ SINIFINI GIRINIZ:  ");
        int sinif = scan.nextInt();

        ogrenci = new Ogrenci(ad,soyad,tcNo,yas,numara++,sinif);




    }
}