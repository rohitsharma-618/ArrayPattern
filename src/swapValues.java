import java.util.Scanner;

public class swapValues {
    static void swap(int a, int b){
        System.out.println("Original value before swap :- ");
        System.out.println("a:- " +a);
        System.out.println("b :- " +b);

        int c = a;  //a == sc.nextInt
        a = b;      //a = b
        b = c;  // b =  a
        System.out.println("AFTER SWAP VALUE OF a :- ");
        System.out.println("a :- " +a);
        System.out.println("b :- " +b);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE VALUE OF a :- ");
        int a = sc.nextInt();
        System.out.println("ENTER THE VALUE OF b :- ");
        int b = sc.nextInt();
        swap(a,b);

    }
}
