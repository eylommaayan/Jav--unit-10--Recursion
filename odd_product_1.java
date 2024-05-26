public class odd_product_1 {
    public static void main(String[] args) {
        System.out.println(oddProduct(5));  // Will print 15 (1*3*5)
        System.out.println(oddProduct(6));  // Will also print 15 (1*3*5), since 6 is even and not included
    }

    /**
     * A recursive function to calculate the product of all odd integers from 1 to n.
     * @param n The last number in the range to calculate the product for.
     * @return The product of all odd integers from 1 to n.
     */
    public static int oddProduct(int n) {
        if (n == 1) {
            return 1;  // Base case: if n is 1, return 1 as it's the first and only odd number starting from 1
        } else if (n % 2 == 1) {
            return n * oddProduct(n - 2);  // Recursive step for odd n: return n times the product of numbers up to n-2
        } else {
            return oddProduct(n - 1);  // Recursive call for even n: calculate the product up to the nearest odd number (n-1)
        }
    }
        
    
}
