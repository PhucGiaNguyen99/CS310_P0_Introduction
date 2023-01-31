import java.util.Arrays;

public class Week1 {
    // Maximum Pairwise Product

    // naive method
    // Consider every pair and keep track of the maximum product.
    // time complexity: O(n^2)
    // space complexity: O(1)
    public static int maxProduct1(int[] arr, int n) {
        if (n < 2) {
            System.out.println("No pair exists!");
            return -1;
        } else {
            int tempMax = Integer.MIN_VALUE;

            // run nested loop
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] * arr[j] > tempMax) {
                        tempMax = arr[i] * arr[j];
                    }
                }
            }
            return tempMax;
        }
    }

    // better method
    // Sorting the array in increasing order. Compare the products of the first 2 elements and the last 2 elements
    // Return the larger pair.
    // time complexity: O(nlogn)
    // space complexity: O(1)jjj
    public static int maxProduct2(int[] arr, int n) {
        if (n < 2) {
            System.out.println("No pair exists!");
            return -1;
        } else {
            Arrays.sort(arr);
            int firstProduct = arr[0] * arr[1];
            int lastProduct = arr[n - 1] * arr[n - 2];
            if (firstProduct >= lastProduct) {
                return firstProduct;
            } else {
                return lastProduct;
            }

        }
    }

    // efficient method
    // solved in a single traversal of the input array
    // Idea: traverse the input array and keep track of 4 values:
    // 1. Maximum positive value.
    // 2. Second maximum positive value.
    // 3. Maximum negative value i.e, a negative value with maximum absolute value.
    // 4. Second maximum negative value.

    // time complexity: O(n)
    // space complexity: O(1)

    public int maxProduct3(int[] arr, int n) {
        if (n < 2) {
            System.out.println("No pair exists!");
            return -1;
        } else if (n == 2) {
            return arr[0] * arr[1];
        } else {
            int maxPosProduct = Integer.MIN_VALUE;
            int secondPosProduct = Integer.MIN_VALUE;
            int maxNegProduct = Integer.MIN_VALUE;
            int secondNegProduct = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                // update maximum and second maximum if needed
                if (arr[i] > maxPosProduct) {
                    secondPosProduct = maxPosProduct;
                    maxPosProduct = arr[i];
                } else if (arr[i] > secondPosProduct) {
                    secondPosProduct = arr[i];
                }
                if (arr[i] < 0 && Math.abs(arr[i]) > Math.abs(maxNegProduct)) {
                    secondNegProduct = maxNegProduct;
                    maxNegProduct = arr[i];
                } else if (arr[i] > secondPosProduct) {
                    secondNegProduct = arr[i];
                }
            }
            if (maxPosProduct * secondPosProduct > maxNegProduct * secondNegProduct) {
                return maxPosProduct * secondPosProduct;
            } else {
                return maxNegProduct * secondNegProduct;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -2, -6};
        int n = arr.length;
        System.out.println(maxProduct1(arr, n));
    }
}