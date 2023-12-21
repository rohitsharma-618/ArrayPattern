import java.sql.SQLOutput;

public class swapDiffMethod {
    static void swap(int a ,int b ){
        System.out.println("ORIGINAL VALUE BEFORE SWAP :- ");
        System.out.println("a:- " +a);
        System.out.println("b :- " +b);

        a = a + b;  // 9 + 3 = 12    // a = 12
        b = a - b;  // 12 - 3 = 9    // b = 9
        a = a - b;  // 12 - 9 = 3    // *a = 3

        System.out.println("AFTER SWAP VALUE :- ");
        System.out.println(" a:- " +a);
        System.out.println("b :- " +b);
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        swap(a,b);
    }
}
