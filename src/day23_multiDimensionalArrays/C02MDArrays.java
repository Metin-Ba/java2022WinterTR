package day23_multiDimensionalArrays;

public class C02MDArrays {
    public static void main(String[] args) {
        // verilen multi dimensional array'in tum elementlerinin toplamini bulunuz


        int arr[][]= {{3,1,7,5},{6,10}};
        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam +=  arr[i][j];
            }
        }
        System.out.println("arraydeki elementlerin toplami : " + toplam);
    }
}
