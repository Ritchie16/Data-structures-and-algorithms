import java.util.Arrays;

public class MyBinarySearch {
    public static int binarySearch(int[] myArray, int target, int left, int right){
        /**if you can't know the importance if this if block.
         * follow the whole binary algorithm with target number of e.g 1, 2, 3, 4, 5 and a target of 6.
         * you end up having outbound errors without this base case e.g myArray[6]
        */
        if(left > right) {
            return -1;
        }

        //calculate middle value
        int mid = left + (right - left) / 2;

        if (target == myArray[mid]){
            return mid;
        }
        else if(target < myArray[mid]){
            return binarySearch(myArray, target, left, mid - 1);
        }else {
            return binarySearch(myArray, target, mid + 1, right);
        }

    }

    
    public static void main(String[] args) {
        int targetValue = 6;

        int[] numbers = {1, 2, 3, 6, 1, 13, 4, 16, 7, 8, 7, 33, 12};

        Arrays.sort(numbers);

        int result = binarySearch(numbers, targetValue, 0, numbers.length - 1);

        if (result == -1) {
            System.out.println("\nElement Not Found\n");
        }else {
            System.out.println("\nElement found at index: " + result + " and value is: " + numbers[result]);
        }
        
    }
}
