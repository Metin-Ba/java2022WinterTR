package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class CO4_Length {

    public static void main(String[] args) {

        //kullanicidan ismini alip basharfini ve son ahrfini buyuk harlerle yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi girin");
        String isim = scan.nextLine();

        System.out.println("ilk harf:" + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf:" + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));


    }

}
