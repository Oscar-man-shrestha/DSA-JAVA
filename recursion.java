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

// public class recursion{
//     public static int printNumbers(int n){
//         if(n==0 || n==1){
//             return n;
//         }
//         int nm1 = printNumbers(n-1);
//         int nm2 = printNumbers(n-2);
//         int fibo = nm1+nm2;
//         return fibo;
//     }
//     public static void main(String args[]){
//         int ans  = printNumbers(3);
//         System.out.println(ans);

//     }
// }
   
// public class recursion{
//     public static void printNumbers(int a,int b,int n){
//         if(n==0){
//             return;
//         }
//           int c = a+b;
//           System.out.println(c); 
//           printNumbers(b, c, n-1);

//     }
//     public static void main(String args[]){
//         int a =0;
//         int b=1;
//         System.out.println(a);
//         System.out.println(b);
//         int n=7;
//         printNumbers(a, b, n-2);
       

//     }
// }


// public class recursion{
//     public static void printNumbers(int a,int b,int n){
//         if(n==0){
//             return;
//         }
//        int c=a+b;
//        System.out.print(c+" ");
//        printNumbers(b, c, n-1);
//        return;
       
//     }
//     public static void main(String args[]){
//        int a=0;
//        int b=1;
//        int n=7;
//        System.out.print (a+" ");
//        System.out.print (b+" ");
//        printNumbers(a, b, n-2);
//     }
// }

//explaination

// suru mah define gare a ra b lai 0 and 1 mah teslai print gare ani n mah k change vayo ra a and b lai argument snet gare animathi c=a+b garera prev num ra prev ko prev number + gare aniprint gare with the change in n which is n-1 ani return garde



// print x^n (stack height =n)
import java.util.*;
public class recursion {
   
    public static int printsquares(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
       
        // if n is even 
        if(n%2==0){
            return printsquares(x,n/2)*printsquares(x,n/2);
        }
        else{       // if n is odd.
            return printsquares(x,n/2)*printsquares(x,n/2)*x;

        }
    
    }
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);      
        System.out.print("Eter value for n: "); 
         int n=sc.nextInt();
         System.out.print("Eter value for x: "); 
         int x=sc.nextInt();
         int result = printsquares(x,n);
         System.out.print(result);
    }
    
}

