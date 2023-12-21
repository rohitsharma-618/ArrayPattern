import java.util.Scanner;

public class max {
    static int maxNum(int[]array) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
                if (array[i] > mx) {
                    mx = array[i] ;
                }
        }
        return mx;
    }

    static int  secondMax (int[]array){
        int mx = maxNum(array);
        for (int i = 0; i < array.length; i++){
            if (array[i] == mx){
                array[i] = Integer.MIN_VALUE;

            }
        }
        int secondMax = maxNum(array);
        return secondMax;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter " + n + " Elements:- ");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("max num of the array is :- " +maxNum(array));
        System.out.println("Second Max num of the array is :- " + secondMax(array));
    }

}
