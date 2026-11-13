package corejava.Arrays;

/*

//----> time complexity
Time Complexity is the amount of time an algorithm takes to complete as the input size (n) increases.

-it determines the speed of the algorithm for large inpurts
- it helps to compare different algorithms for the same problems

/

//worst case senarios
//O(n) - symbol of time complexity
//ignore constants - numbers eg. f(n) = 4n*n + 3n + 5 (here ignore 4-3-5)
//bigger choose for time complexity

//jas jas increase hotay tas worst case kade jat - following are comman time complexities
O(1) - excellent --> execution time does not depend on input size
O(log n) - Very Good --> time grows slowly as input size increase - binary search
O(n) - Good - time grows directly in proportion to input size
O(n log n) - Acceptable
O(x^2) - Poor - Time grows proportionally to the square of input size - nested loop
O(x^3) - Very Poor
O(2^x) - Extremely Bad - time double with every additional input element - recursive fibonacci withoud memoization
O(n!) - Worst




//----> space complexity
//amount of space taken by an algorithm as function of input size(n)
//
*/


public class timeAndSpaceComplexity {

// ----> O(1)
//    //input vadala tri kamachi sankhya tharleli aste
//     static int addFirstwo(int[] numbers){
//         int sum = numbers[0] + numbers[1];
//         System.out.println(sum);
//         return sum;
//     } // in the array if there is 50000 elements then also we want only first 2
//
//    static int findLastNum(int[] numbers){
//         int lastIndex = numbers.length -1;
//        System.out.println(lastIndex);
//         return numbers[lastIndex];
//    }


// ----O(log n)
// Binary search finds a value in a sorted array.
// O(log n) means the steps grow slowly as the array gets bigger.
// Each step cuts the search area in half.

//    static int findTarget(int[] numbers, int target) {
//        int low = 0;
//        int high = numbers.length - 1;
//        int steps = 0;
//
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            steps++;
//
//            if (numbers[mid] == target) {
//                System.out.println("Steps: " + steps);
//                return mid;
//            }
//
//            if (target > numbers[mid]) {
//                low = mid + 1;
//            } else {
//                high = mid - 1;
//            }
//        }
//
//        return -1;
//    }



// ----> O(n)
// O(n): Input jitka vadhel, titke kaam vadhel.
// Udaharan: Array madhil saglya numbers chi berij kadhne.
// 10 numbers → 10 iterations, 100 numbers → 100 iterations.


public static void main(String[] args){

// ----> O(n)
//    int[] numbers = {10, 20, 30};
//    int sum = 0;
//
//    for (int i = 0; i < numbers.length; i++) {
//        sum = sum + numbers[i];
//    }
//
//    System.out.println(sum);

//
//    int[] num = {1,2,3,4,5,6,7,8,9,10};
//    int sum = 0;
//
//    for (int i =0; i < num.length; i++){
//        sum = sum + num[i];
//    }
//    System.out.println(sum);

// ----O(log n)
//        int n = 10000;
//        while(n>1){
//            System.out.println(n);
//            n = n/2;
//        }

//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int target = 4;
//
//        int index = findTarget(numbers, target);
//
//        if (index == -1) {
//            System.out.println("Not found");
//        } else {
//            System.out.println("Found at index: " + index);
//        }



// ----> O(1)
//         int[] numbers = {10,20,30,40,50};
//         addFirstwo(numbers);
//
//         findLastNum(numbers);
    }
}
