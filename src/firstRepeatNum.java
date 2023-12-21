import java.util.Scanner;

public class firstRepeatNum {
    static int repeat(int[] array){
        int a = array.length;
        for (int i = 0; i < array.length;i++){
            for (int j = i + 1; j < a ; j++){
                if( array[i] == array[j]){
                    return array[i];
                }
            }
        }
        return -1;
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

        System.out.println("first repeat num in  array :- " +repeat(array));
    }
}
