package corejava.Arrays;

public class Declaration {
    public static void main(String[] args){

        // array declaration
        // datatype of array like - int (datatype declaration importat - so computer know how much memory required to store this array and emelemtn , eg , each element have 32 bit in int )
        // [] - square bracket denote that we are creating an array - declaring array
        // after square bracket there should be a name of the array
        // eg . int [] rollNumber;

//        int rollNumber[] = new int [3];

//        int [] rollNumber = new int [3]; // ----> defind how many elemetns in array / size of array - 3 means how many memory i have to allocate integers
//        rollNumber[0] = 101; //
//        rollNumber[1] = 102;
//        rollNumber[2] = 103;
//        System.out.println(rollNumber[0]);
//
//        int x = 101;
//        for (int i = 0; i< rollNumber.length ; i++){
//            rollNumber[i] = x;
//            x++;
//        }
//
//        for (int i = 0; i< rollNumber.length; i++){
//            System.out.println(rollNumber[i]);
//        }



        //Multidimensional array

        // --> int [] [] marks = new int [3][3]; // 3 students , 3 subjects
//              for(int row = 0; row < 3; row++){
//                  for (int col = 0; col < 3 ; col ++){
//                      System.out.println(marks[row][col]);
//                  }
//              }


        //--> int [][] marks = new int [3][];
//        marks[0] = new int [2];
//        marks [1] = new int [3];
//        marks[2] = new int [4];
        // 3D Array
//        int [][][] arr = new int[][][];


//        int[] rollNum = {4,5,6};
//
//        int [] [] rollNumber = {{1,2,3},{5,6,7}};

//        int [] [] Marks = new int [3][3];
//        marks [0] [0] = 23;
//        marks [0] [1] = 24;
//        marks [0] [2] = 25;
//
//        marks [1] [0] = 28;
//        marks [1] [1] = 29;
//        marks [1] [2] = 21;
//
//        marks [2] [0] = 22;
//        marks [2] [1] = 34;
//        marks [2] [2] = 45;
//
//        for(int row = 0; row < marks.length ; row++){
//            for (int col = 0; col < marks.length; col++){
//                System.out.println(marks[row][col] + " ");
//            }
//            System.out.println();
//        }


//
//        int [][] mark = new int [3][];
//        mark[0] = new int[1];
//        mark[1] = new int [2];
//        mark [2] = new int[3];
//
//        mark[0][0] = 23;
//
//        mark[1][0] = 24;
//        mark[1][1]= 90;
//
//        mark[2][0] = 12;
//        mark[2][1] = 78;
//        mark[2][2] = 45;
//
//        for(int row = 0 ; row < mark.length ; row++){
//            for( int col = 0; col<mark[row].length; col++){
//                System.out.print(mark[row][col] + " ");
//            }
//            System.out.println();
//        }


        /*
        	Total and average marks. Traverse the array to
        	calculate the total and the average. Preserve the
        	decimal part of the average.
         */
//
//        int [] arr = {12,43,56,23,90,56,45};
//        int total = 0;
//        for (int mark:arr){
//           total += mark;
//        }
//
//        double average = (arr.length>0) ?(double) total arr.length:0.0;
//        System.out.println(total);
//        System.out.println(average);



    }
}
