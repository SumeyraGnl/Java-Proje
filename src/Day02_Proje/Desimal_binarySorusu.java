package Day02_Proje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Desimal_binarySorusu {
    public static void main(String[] args) {

        // girilen desimal  degeri binary degere ceviren methodu olusturunuz.
        // Ornek: 12 = 1 1 0 0

        Scanner scan= new Scanner(System.in);
        System.out.print("Desimal deger giriniz: ");
        int sayi=scan.nextInt();

        System.out.println(sayi+ " desimal degerin binary karsiligi= "+binaryDonusum(sayi));


    }

    private static ArrayList<Integer> binaryDonusum(int sayi) {
        ArrayList<Integer> binary = new ArrayList<>();
        while (sayi>=1){   // 12 desimal degerin binary karsiligi= [0, 0, 1, 1] biz tersini elde etmek istiyoruz

            binary.add(sayi%2);
            sayi /= 2;  // sayi=sayi/2

        }
        ArrayList<Integer> binaryTers = new ArrayList<>();

           // Collections.reverse(binary); ==> bu method ile direk ters yazdirabiliriz.return 'e binary yazıcaz

        for (int i = binary.size()-1 ; i >=0 ; i--) {
            binaryTers.add(binary.get(i));   // 12 desimal degerin binary karsiligi= [1, 1, 0, 0]

        }


        return binaryTers;
    }

}
