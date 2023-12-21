import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class TripletSum {
    static int Triplet(int[] array , int target){
        int n = array.length;
        int sum = 0;
        for (int i = 0 ; i < n ;i++){
            for (int j  = i+1; j < n;j++){
                for (int k = j+1; k < n ; k++){
                    if( array[i] + array[j] +array[k] == target){
                        sum++;
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        int n  = sc.nextInt();

        int [] array = new int[n];
        System.out.println("Enter " + n + " Elements:- ");

        for (int i = 0 ; i < n; i++ ){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter Target sum :- ");
        int target = sc.nextInt();

        System.out.println("sum of three array element:- " +Triplet( array , target));
    }

}
