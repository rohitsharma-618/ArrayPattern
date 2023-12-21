public class reverseArray_1 {

        static void printArray_1(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
            System.out.println();
        }
        static void swapInArray(int [] array, int i , int j){
            int temp = array[i];
            array[i]= array[j];
            array[j] = temp;
        }

        static void revArray_1(int[] array){
            int n = array.length;
            int i = 0,j=n-1;
            while(i < j){
                swapInArray(array,i,j);
                i++;
                j--;
            }
        }
    public static void main(String[] args) {
        int []array = {1,2,3,4,5};
        revArray_1(array);
        printArray_1(array);
    }
}
