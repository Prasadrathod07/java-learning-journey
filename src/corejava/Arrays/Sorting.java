package corejava.Arrays;

import java.util.Arrays;

// Sorting ---> array madhle elements order madhe lavne
// ascending  (lahan te motha) ---> 1 2 3 4 5
// descending (motha te lahan) ---> 5 4 3 2 1

// 3 types
// 1. Bubble sort    - shejari-shejari che 2 elements compare karto , order chukla tar swap
// 2. Selection sort - sarvat lahan element shodhto ani tyala pudhe aanto
// 3. Arrays.sort()  - Java cha ready method


// ----------------> Swap
/*
 2 variables chi value adla-badal karaychi asel tar temp variable lagto
 int temp = a;
 a = b;
 b = temp;
 */




// ----------------> Bubble Sort
/*
 - shejari-shejari che 2 elements compare karto ---> arr[j] ani arr[j + 1]
 - arr[j] > arr[j + 1] asel tar swap
 - pratyek round nantar sarvat motha element shevti jato (bubble sarkha var yeto)
 - n elements sathi n - 1 rounds lagtat
 - shevtche elements already sorted astat , mhanun inner loop ---> j < n - 1 - i

 eg : {64, 34, 25, 12, 22}
 round 1 ---> 34 25 12 22 64   (64 shevti gela)
 round 2 ---> 25 12 22 34 64   (34 tyachya jagi aala)
 round 3 ---> 12 22 25 34 64
 round 4 ---> 12 22 25 34 64   (sorted)

 Time  : O(n²) ---> loop chya aat loop
 Space : O(1)  ---> tyach array madhe sort hoto , navin array lagat nahi
 */


// ----------------> Selection Sort
/*
 - pratyek round madhe baki array madhla sarvat lahan element shodhto (minIndex)
 - tyala round chya first position shi swap karto
 - pratyek round madhe fakt 1 swap ---> bubble sort peksha kami swap

 eg : {29, 10, 14, 37, 13}
 round 1 ---> 10 29 14 37 13   (10 sarvat lahan , index 0 la aala)
 round 2 ---> 10 13 14 37 29
 round 3 ---> 10 13 14 37 29
 round 4 ---> 10 13 14 29 37   (sorted)

 Time  : O(n²)
 Space : O(1)
 */


// ----------------> Arrays.sort()
/*
 - import java.util.Arrays; lagto
 - Arrays.sort(arr)     ---> array ascending order madhe sort hoto
 - Arrays.toString(arr) ---> array print karayla ---> [1, 2, 3]
 - Arrays.binarySearch(arr, key) ---> sorted array madhe key shodhto
                                     nahi milala tar negative number deto (fakt -1 nahi)

 Time : O(n log n) ---> bubble / selection peksha khup fast
 */


// method void aahe tari original array sort hoto
// karan method la array cha reference jato , copy nahi



public class Sorting {

    // --------------> Example 1
    /*
    Bubble sort - simple
    Sort the array {64, 34, 25, 12, 22} in ascending order using bubble sort.
    Expected: [12, 22, 25, 34, 64]
     */
//    static void bubbleSort(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }


    // --------------> Example 2
    /*
    Selection sort - simple
    Sort the array {29, 10, 14, 37, 13} in ascending order using selection sort.
    Expected: [10, 13, 14, 29, 37]
     */
//    static void selectionSort(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] < arr[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//    }


    // --------------> Example 3
    /*
    Descending order

    Requirements:
    1. Create a bubbleSortDescending() method.
    2. Sort the array {5, 1, 4, 2, 8} from largest to smallest.
    3. Print the sorted array.
    Expected: [8, 5, 4, 2, 1]

    Hint : bubble sort madhe fakt > chya jagi < kara
     */
//    static void bubbleSortDescending(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }


    // --------------> Example 4
    /*
    Top 3 marks using Arrays.sort()

    Requirements:
    1. Create a marks array {78, 45, 90, 62, 55, 88}.
    2. Sort it using Arrays.sort().
    3. Print the sorted array, the lowest marks and the highest marks.
    4. Print the top 3 marks from highest to lowest.
    Expected: Sorted: [45, 55, 62, 78, 88, 90]
              Lowest: 45
              Highest: 90
              Top 3: 90 88 78
     */
//    static void printTopThree(int[] marks) {
//        Arrays.sort(marks);
//        System.out.println("Sorted: " + Arrays.toString(marks));
//        System.out.println("Lowest: " + marks[0]);
//        System.out.println("Highest: " + marks[marks.length - 1]);
//
//        System.out.print("Top 3: ");
//        for (int i = marks.length - 1; i >= marks.length - 3; i--) {
//            System.out.print(marks[i] + " ");
//        }
//        System.out.println();
//    }


    // --------------> Example 5
    /*
    Sort first , then binary search

    Requirements:
    1. Take the unsorted array {45, 12, 78, 34, 23}.
    2. Sort it using Arrays.sort() and print it.
    3. Search for 34 using Arrays.binarySearch().
    4. If found, print its index. Otherwise, print "Not found".
    Expected: Sorted: [12, 23, 34, 45, 78]
              Found at index 2
     */
    static void sortAndSearch(int[] arr, int key) {
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, key);
        System.out.println(index < 0 ? "Not found" : "Found at index " + index);
    }


    public static void main(String[] args) {


        //----> example 5
        int[] numbers = {45, 12, 78, 34, 23};
        sortAndSearch(numbers, 34);


        //----> example 4
//        int[] marks = {78, 45, 90, 62, 55, 88};
//        printTopThree(marks);


        //----> example 3
//        int[] arr3 = {5, 1, 4, 2, 8};
//        bubbleSortDescending(arr3);
//        System.out.println(Arrays.toString(arr3));


        //----> example 2
//        int[] arr2 = {29, 10, 14, 37, 13};
//        selectionSort(arr2);
//        System.out.println(Arrays.toString(arr2));


        //----> example 1
//        int[] arr1 = {64, 34, 25, 12, 22};
//        bubbleSort(arr1);
//        System.out.println(Arrays.toString(arr1));
    }
}
