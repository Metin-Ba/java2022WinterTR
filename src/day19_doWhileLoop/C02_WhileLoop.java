package day19_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin ve
        // bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin


        int input =20;

        //for loop ile de yapilabilir
        //While loop la yapiyoruz

        int bolen =1;
        int sayac =0;

        while(bolen<=input){

            if(input % bolen == 0){
                System.out.println(bolen+" ");
                sayac++;
            }
            bolen++;
        }
    }
}
