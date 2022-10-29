/*Pseudocode
 * Insertion Sort(A){
 *  for (int i = 0 ; i < A.length < i++){
 *      key = A[i];
 *      j = i-1;
 *      while(j > -1 and A[j] > key){
 *          A[j+1] = A[j];
 *          j = j-1;
 * }
 * A[j+1] = key
 * }
 * 
 * }
 * 
 */

public class Lab3_2540_Q1 {

    public static void insertionSort(int A[]) {
        int n = A.length;
        for (int j = 1; j < n; j++) {
            int key = A[j];

            int i = j - 1;
            // Move elements of arr[0..i-1], that are
            // greater than key, to one position ahead
            // of their current position
            while ((i > -1) && (A[i] > key)) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }
    }

    public static void main(String a[]) {
        int[] arr1 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println("Before Sorting: ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        insertionSort(arr1);
        // sorting array using insertion sort
        System.out.println("After Insertion Sort: ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Before Sorting: ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
        insertionSort(arr2);
        // sorting array using insertion sort
        System.out.println("After Insertion Sort: ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        int[] arr3 = { 1, 2, 4, 5, 3, 7, 8, 10, 11, 9, 6 };
        System.out.println("Before Sorting: ");
        for (int i : arr3) {
            System.out.print(i + " ");
        }
        System.out.println();
        insertionSort(arr3);
        // sorting array using insertion sort
        System.out.println("After Insertion Sort: ");
        for (int i : arr3) {
            System.out.print(i + " ");
        }
    }
}
