package corejava.string;

public class Immutability {
    public static void main (String[] args){

        String s =  "";
        for (int i = 0; i <= 5 ; i++){
            s += i;
            System.out.println(s);

        // first s will be 0 and later when loop become 1 then s will be 01 and previous 1 no use
        // after this loop the final s =  012345 but
            /*  in the heap memore there is first fev object also consuming memory
                solution on this java build String builder and buffer
            0
            01
            012
            0123
            01234
            012345
             */
        }

        // Hashcode , byte coder , byte values
         /*
         byte[] values
         String s = "Java";
         values -  values of array and there will be unicode value of Java.

         ASCII value - 1 byte  - 256

         // Byte coder  - 0 or 1
           if catector came form ASCII character then that should be 0 - latin formate 1 byte
           else 1 (special charactor - which not in ASCII that should be 1) - UTF 16 formate this take 2 byte
           
           eg :
              String s = "Java";
              values[] = 74,97,118,98   //-->ASCHII values of Java
              coder    = 0

           eg 2 :
              String a = "कख";
              values[] = {for क - 2 byte required , same for ख = that mean we required 4 bytes}
              coder = 1

              // if code value become 1 then that say to jvm/String class that read 2 values and read for 1 charactor


          String optimigation : String pool  , character array shift to byte array , caching the hash values
          
          */


    }                            
}
