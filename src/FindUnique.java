import java.util.Scanner;

public class FindUnique {
    static int UniqueNum(int[]array) {
        int n = array.length;
//        int num = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[i] = -1;
                    array[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                ans = array[i];
            }
        }
        return ans;
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
        System.out.println("Unique num of the array is :- " + UniqueNum(array));
    }

}

