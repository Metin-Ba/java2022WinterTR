package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {
        String str = "Bugun ne cok sey ogrendik";

        System.out.println("space haric yeni karacter sayisi :"+str.replace(" ","").length());

        System.out.println("original str karacter sayisi : "+str.length());


        //str kalici degisiklik yapalim bugun yerine yarin yazalim

        str = str.replace("Bugun", "Yarin");
        str= str.replace("ogrendik","ogrenecegiz");

        System.out.println("kalici degisiklik sonrasi : "+str);

        str = str.replace("ne cok sey", " neler neler");
        System.out.println(str);

    }
}
