/*
 * 
 * מועד א שאלון 481 2016
 * 
 * לפצל רשימה לשתי רישמות ולהחזיר את שתי הרשימות שבינהם הפרש מנימלי
 * 
 */


public class minDiff {

    // Public method to start the recursion with initial parameters
    public static int minDiff(int[] arr) {
        return minDiff(arr, 0, 0, 0);
    }

    // Private recursive method to find the minimum difference
    private static int minDiff(int[] arr, int i, int setA, int setB) {
        // Base case: if we've considered all elements
        if (i == arr.length) {
            return Math.abs(setA - setB); // Return the absolute difference between the two sets
        }

        // Recur by including the current element in setA or setB
        int resSetA = minDiff(arr, i + 1, setA + arr[i], setB);
        int resSetB = minDiff(arr, i + 1, setA, setB + arr[i]);

        // Return the minimum difference
        return Math.min(resSetA, resSetB);
    }

     // Main method for testing
     public static void main(String[] args) {
        int[] arr = {1, 6, 11, 5};
        System.out.println("The minimum difference is: " + minDiff(arr));
    }
}