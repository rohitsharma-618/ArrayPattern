import java.util.Scanner;

public class TargetSum {
    static int  TargetSum(int[]array , int target ){
        int n  = array.length;
      int sum = 0;
        for(int i = 0; i < n;i++){
            for (int j = i+1 ; j < n; j++){
                if (array[i] + array[j] == target){
                    sum++;
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

        System.out.println("sum of two array element:- " +TargetSum(array , target));
    }
}
