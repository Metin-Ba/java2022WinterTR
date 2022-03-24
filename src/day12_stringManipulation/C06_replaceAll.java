package day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isim ve soy ismi yaziniz");
        String isimSoyIsim = scan.nextLine();

        System.out.println(isimSoyIsim.replaceAll("\\s", "*"));

        System.out.println(isimSoyIsim.replaceAll("\\S","*"));
    }
}
