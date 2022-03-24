package day17_forLoop;

public class C05_ForLoop {

    public static void main(String[] args) {

            // Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin.
            // 1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.
            int sayi=57;
            for (int i = 1; i <=sayi ; i++) {
                if (i%3==0){
                    System.out.print(i + " ");
                }
            }


        System.out.println("********************************************");


        // 10 ile 30 arasindaki(10 ve 30 dahil)
        // sayilari aralarinda virgul olarak ayni satirda yazdirin
        for (int i = 10; i <=29 ; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(30);
        int baslangic=15;
        int bitis=20;
        for (int i = baslangic; i <=bitis ; i++) {
            if (i<bitis){
                System.out.print(i + ", ");
            } else{
                System.out.println(i);
            }
        }
    }
}