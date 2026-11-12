package corejava.Arrays;

public class DuplicatesAndFrequency {

//Brute force method - this take first element and that element match with another, then take another element and continue
/*
simple but  time consume , performance slow ,
int a = {1,2,3,4,5,6,6,7};

in this case element only need to repeat once - if that is repeating more that 2 times then this will not work properly
 */
//    public static void bruteForce( int[] arr) {
//        for (int i = 0; i <= arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j] && (i != j)) {
//                    System.out.println(arr[j]);
//                }
//            }
//        }
//    }


//Set Interface
    ///I'll Revisit this after completing the Collections syllabus.



 //Frequency counting
 //in a arrya how many times that elements come's we count that and that is called frequency counting
static int countFrequency(int[] arr , int key){
    int count = 0;

    for (int i =0; i < arr.length;i++){
        if(arr[i] == key){
            count ++;
        }
    }
    return count;
}

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,6,7};
        int key = 6;
        int totalCount = countFrequency(arr , key);
        System.out.println(key + totalCount);


//        bruteForce(arr);

    }
}


