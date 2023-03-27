package Day01_Proje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UrunSorusu {


        /*
                  Basit bir 5 ürünlü manav alisveris programi yaziniz.

                1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
                2. Adim : Baska bir urun almak isteyip istemedigini sor.
                istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
                Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
                3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
                4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

         */

        static ArrayList<String> UrunListesi= new ArrayList<>(Arrays.asList("1. Domates","2. Sogan","3. Portakal","4. Elma","5. Kivi"));
         static ArrayList<Integer> FiyatListesi= new ArrayList<>(Arrays.asList(15,18,13,10,17));

         static int tutar;

    public static void main(String[] args) {

        System.out.println("*******YILDIZ MANAV*******");
        urunsec();
    }

    private static void urunsec() {

        Scanner scan=new Scanner(System.in);

        System.out.println("URUN SECİNİZ:");

        for (String each: UrunListesi
             ) {
            System.out.println(each);
        }
        System.out.print("HANGİ URUNDEN ALMAK ISTIYORSUNUZ:");

        int secim= scan.nextInt();

        System.out.print("ALMAK ISTEDIGINIZ KG BELİRTİN: ");

        int miktar=scan.nextInt();

        tutar += miktar* FiyatListesi.get(secim-1);

        System.out.println("EKLEMEK ISTEDİGİNİZ BASKA BİR URUN VAR MI?(E/H)");

        char tercih= scan.next().toUpperCase().charAt(0);

        if (tercih=='H'){
            System.out.println("ODENECEK TUTAR: "+ tutar);
            System.exit(0);

        } else {
            urunsec();
        }


    }


}

