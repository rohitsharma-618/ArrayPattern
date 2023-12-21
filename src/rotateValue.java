import java.util.Scanner;

public class rotateValue {
    static int [] rotate(int []array, int A){
        int n = array.length;
        A = A %  n ;
        int [] ans = new int[n];
        int j = 0;

        for (int i  = n - A ; i < n ; i ++){
         ans[j++] = ans[i];
        }

        for (int i = 0 ; i < n - A; i++){
            ans[j++] = ans[i];
        }

        return ans;
    }
    static void printArray_1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter " + n + " Elements:- ");

        for (int i = 0;i < n;i++){
            array[i] =sc.nextInt();
    }
        System.out.println("ENTER A :- ");
        int A  =  sc.nextInt();

        System.out.println("ORIGINAL ARRAY:- ");
        printArray_1(array);

        int [] ans = rotate(array , A);

        System.out.println("ARRAY AFTER ROTATION :- ");
        printArray_1(ans);

    }
}
