package day17_forLoop;

public class C01_SonsuzDogru {

    public static void main(String[] args) {


        // bu kodu calistirirsak sonsuz donguye girer
        // ve ram dolup bilgisayari kitleyene kadar calisir
        for (int i = 0; i >=0 ; i++) {
            System.out.print(i);
        }

//
//        for (int i = 1 ; i <=10 ;i++) {
//            System.out.println(i+"- Java guzeldir");
//
//            for (int i1=100; i1 > 10; i1--) {
//                System.out.print(i1);
//
//
//                }
//            }
//
//        }


        for (int i = 1; i <= 5; i++) {

            for (int j = (5 - i); j > 1; j--) {

                System.out.print(i + j);

            }

            System.out.println();

        }}
}






