package Day02_Proje;

import java.util.Random;

public class TarihSorusu {

    /*
          Bu uygulama bir Arraye random olarak oluşturulan 10 tarih ekleyin ve
           bu tarihleri en eskiden yeniye doğru sıralayınız.

            Yil degiskeni icin 2013 ila 2022 arasinda random sayi uretin
            Ay degiskeni icin 1 ila 12 arasinda random sayi uretin
            Gun degiskeni icin 1 ila 28 arasinda random sayi uretin

          LocalDate clasini kullanarak bu uc degiskeni bir method icine gonderin ve random tarih uretin
     */

    public static void main(String[] args) {
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            int yil = rnd.nextInt(2013);
            int ay = rnd.nextInt();

        }

    }
}
