//                                           bit Mask [SET] 

//         { Main aim : Tyo particular index mah k xa 0 or 1 .}

// public class operatorsAndBinary {
//     public static void main (String args []){
//       int n=5; 
//       int pos=1;
//       int bitMask=1<<pos;

//       if((bitMask & n )==0){
//         System.out.print("bit was zero");
//       }
//       else{
//         System.out.print("bit was one");
//       }

//     } 
// }  

//                                           bit Mask [SET] 

//             tyo index position lai set garne  0 or 1 mah


// public class operatorsAndBinary {
//     public static void main (String args []){
//      int n=5;
//      int pos=1;
//      int bitMask=1<<pos;
//      int newNumber=bitMask | n;
//      System.out.println(newNumber); 
// } 
// }

//                                           bit Mask [CLEAR BIT] 

 


// public class operatorsAndBinary {
//     public static void main (String args []){
//     int n=5;
//     int pos=2;
//     int bitMask=1<<pos;
//     int notBitMask=~(bitMask);

//     int and = notBitMask & n;
//     System.out.print(and);

// } 
// }


//                                         bit Mask [UPDATE BIT]

//---------------------------------------------------------------- 
// for 0:                      |                     for 1:       |
// Bit Mask: 1<<i              |                 Bit Mask:1<<i    |
// Operation:And with NOT      |                 Operation:OR     |
//---------------------------------------------------------------- 

// import java.util.*;
// public class operatorsAndBinary{
//     public static void main(String args[]){
//         while(true){
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Update for 0 or 1? :");
//         int choice =sc.nextInt();
        
//         int n=5;
//         int pos=1;
//         int bitMask=1<<pos;
//         int notBitMask=~(bitMask);

       
//         if(choice==0){
//             int and=notBitMask & n;
//             System.out.println(and);
//         }
//         else
//         {
//             int or=bitMask | n;
//             System.out.println(or);
//         }
    
// }
//     }
// }