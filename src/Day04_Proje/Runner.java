package Day04_Proje;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    /*

    2. ============= İŞLEMLER =============
             1-EKLEME
             2-ARAMA
             3-LİSTELEME
             4-SİLME
             Q-ÇIKIŞ

        SEÇİMİNİZ:

      ŞEKLİNDE BİR MENÜ OLUŞTURULMALI.

    3. ARAMA VE SİLME İŞLEMLERİ KİMLİK NO YA GÖRE YAPILMALIDIR.

     */

    public static void main(String[] args) {


        List<Ogrenci> ogrList = new ArrayList();

        Ogrenci ogrenci1 = new Ogrenci("Sumeyra", "Gunel", "1111", 37, 55, 1);
        ogrList.add(ogrenci1);
        Ogrenci ogrenci2 = new Ogrenci("Sumeyra", "Gunel", "2222", 37, 55, 1);
        ogrList.add(ogrenci2);
        Ogrenci ogrenci3 = new Ogrenci("Sumeyra", "Gunel", "3333", 37, 55, 1);
        ogrList.add(ogrenci3);

        Islemler islemler=new Islemler();
        islemler.menu(ogrList);



    }
}