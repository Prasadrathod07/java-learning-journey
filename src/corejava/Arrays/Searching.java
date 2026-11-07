package corejava.Arrays;

import java.util.Scanner;

// Searching ---> array madhe ek element shodhne
// element aahe ka nahi ? ani aahe tar kontya index la aahe ?

// 2 types
// 1. Linear search - one by one search (sequential search)
// 2. Binary search - fakt sorted array var chalto , pratyek step la array ardha hoto


// ----------------> Linear Search
/*
 - index 0 pasun last index paryant ek ek element check karto
 - element milala ---> tyacha index return karto
 - nahi milala    ---> -1 return karto
   (-1 ka ? karan array madhe index kadhich -1 nasto , mhanun -1 = "not found")
 - array sorted aso kiva naso , donhi var chalto

 Time  : O(n) ---> worst case madhe sagle n elements check karave lagtat
 Space : O(1) ---> extra memory lagat nahi
 */


// ----------------> Binary Search
/*
 - fakt SORTED array var chalto (aadhi sort , mag search)
 - low = 0 , high = arr.length - 1
 - mid = (low + high) / 2
 - arr[mid] == key ---> found , mid return kar
 - key < arr[mid]  ---> left side la shodha  ---> high = mid - 1
 - key > arr[mid]  ---> right side la shodha ---> low = mid + 1
 - low > high zala ---> not found , -1 return kar

 Time  : O(log n) ---> pratyek step la array ardha hoto
 Space : O(1)

 Linear vs Binary (1000 elements)
 - linear ---> 1000 checks paryant
 - binary ---> fakt 10 checks paryant

 */



public class Searching {

    // --------------> Example 1
    /*
    Linear search - simple
    Search for 23 in the array {12, 43, 56, 23, 90, 45}.
    Expected: Found at index 3
              Searching for 100 ---> Not found
     */
//    static int linearSearch(int[] arr, int key) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == key) {
//                return i;
//            }
//        }
//        return -1;
//    }


    // --------------> Example 2
    /*
    Linear search - take input from the user

    Requirements:
    1. Create a getData() method that reads 5 numbers using Scanner and returns the array.
    2. Read the number to search from the user.
    3. Search for the number using linearSearch().
    4. If found, print its index. Otherwise, print "Not found".
     */
//    static int[] getData(Scanner sc) {
//        int[] a = new int[5];
//        System.out.println("Enter 5 numbers:");
//        for (int i = 0; i < a.length; i++) {
//            a[i] = sc.nextInt();
//        }
//        return a;
//    }


    // --------------> Example 3
    /*
    Binary search
    Search for 56 in the sorted array {5, 12, 23, 34, 45, 56, 67, 78}.
    Expected: Found at index 5
     */
//    static int binarySearch(int[] arr, int key) {
//        int low = 0;
//        int high = arr.length - 1;
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//
//            if (arr[mid] == key) {
//                return mid;
//            } else if (key < arr[mid]) {
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return -1;
//    }


    // --------------> Example 4
    /*
    Search in a 2D array

    Requirements:
    1. Create a marks[3][3] array (3 students , 3 subjects).
    2. Find which student scored 90 marks.
    3. If found, print "Found at student X , subject Y".
    4. If not found, print "Not found".
    Expected: Found at student 2 , subject 3

    Time : O(rows * cols) ---> sagle elements check karave lagu shaktat
     */
//    static void searchIn2D(int[][] marks, int key) {
//        for (int row = 0; row < marks.length; row++) {
//            for (int col = 0; col < marks[row].length; col++) {
//                if (marks[row][col] == key) {
//                    System.out.println("Found at student " + (row + 1) + " , subject " + (col + 1));
//                    return;
//                }
//            }
//        }
//        System.out.println("Not found");
//    }


    // --------------> Example 5
    /*
    Linear vs Binary - count the steps

    Requirements:
    1. Create a sorted array of numbers from 1 to 1000.
    2. Search for the number 1000.
    3. Print how many steps linear search took and how many steps binary search took.
    Expected: Linear steps: 1000
              Binary steps: 10
     */
    static int linearSteps(int[] arr, int key) {
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == key) {
                break;
            }
        }
        return steps;
    }

    static int binarySteps(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int steps = 0;

        while (low <= high) {
            steps++;
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return steps;
    }


    public static void main(String[] args) {

        //----> example 5
        int[] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println("Linear steps: " + linearSteps(numbers, 1000));
        System.out.println("Binary steps: " + binarySteps(numbers, 1000));


        //----> example 4
//        int[][] marks = {{45, 67, 89}, {56, 78, 90}, {34, 88, 72}};
//        searchIn2D(marks, 90);


        //----> example 3
//        int[] sorted = {5, 12, 23, 34, 45, 56, 67, 78};
//        int index3 = binarySearch(sorted, 56);
//        System.out.println(index3 == -1 ? "Not found" : "Found at index " + index3);


        //----> example 2
//        Scanner sc = new Scanner(System.in);
//        int[] a = getData(sc);
//        System.out.print("Enter number to search: ");
//        int key = sc.nextInt();
//        int index2 = linearSearch(a, key);
//        System.out.println(index2 == -1 ? "Not found" : "Found at index " + index2);


        //----> example 1
//        int[] arr = {12, 43, 56, 23, 90, 45};
//        int index1 = linearSearch(arr, 23);
//        System.out.println(index1 == -1 ? "Not found" : "Found at index " + index1);
    }
}
