// public class recursion {
//     public static void printNumbers(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         printNumbers(n-1);

//     }
//         public static void main(String args[]){
//             int n=5;
//             printNumbers(n);

//     }
    
// }

//SUM OF N NATURAL NUMBER

// public class recursion {
//     public static void printNumbers(int i,int n,int sum){


//         //Base case...


//         if(i==n){
//            sum+=i;
//             System.out.println(sum);
//             return;
//         }
//              sum+=i;
//              printNumbers(i+1,n,sum);
//              System.out.println(i);

//     }
//     public static void main (String args[]){
//         printNumbers(1, 5, 0);

//     }
    
// }


//        FACTORIAL OF A NUMBER N

// import java.util.*;
// public class recursion{
//     public static int printNumbers(int n){
//         if(n==1 || n==0){
//             return 1;
//         }
//        int factnm1 = printNumbers(n-1);
//        int fact=n*(factnm1);
//        return fact;
//     }
// public static void main (String args[]){

//     Scanner sc= new Scanner(System.in);
//     System.out.print("Enter value for n :");
//     int n=sc.nextInt();
//    int print =  printNumbers(n);
//    System.out.println(print);
// }
// }


//   FIBONACCI SEQUENCES TILL Nth TERM..

