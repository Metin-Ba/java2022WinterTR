package day11_stringManipulation;

import java.util.Locale;

public class C01_toLwerCase_toUpperCase {
    public static void main(String[] args) {


        String str = "java guzeldir";


        str.charAt(5);

        System.out.println(str.toLowerCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));



    }




}
