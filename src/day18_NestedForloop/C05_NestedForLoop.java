package day18_NestedForloop;

public class C05_NestedForLoop {

    public static void main(String[] args) {

        /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        seklini yazdiriniz.

         */


        char input = 'F';

       for (char i = 'A'; i <= input; i++) {   //satir
            for (char j = 'A'; j<=i ;j++){     //sutun
                System.out.print(j+" ");
            }
            System.out.println("");
       }




    }
}
