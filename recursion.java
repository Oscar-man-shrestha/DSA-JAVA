// Recursion - 01

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

// import java.util.*;
// public class recursion {

//     public static int printsquares(int x,int n){
//         if(n==0){
//             return 1;
//         }
//         if(x==0){
//             return 0;
//         }

//         // if n is even 
//         if(n%2==0){
//             return printsquares(x,n/2)*printsquares(x,n/2);
//         }
//         else{       // if n is odd.
//             return printsquares(x,n/2)*printsquares(x,n/2)*x;

//         }

//     }
//     public static void main (String args []){
//         Scanner sc = new Scanner (System.in);      
//         System.out.print("Eter value for n: "); 
//          int n=sc.nextInt();
//          System.out.print("Eter value for x: "); 
//          int x=sc.nextInt();
//          int result = printsquares(x,n);
//          System.out.print(result);
//     }

// }

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Recursion  - 2  

// Tower of Hanoi

// public class recursion {
//     public static void towerOfHanoi(int n, String src, String helper, String dest) {
//         if (n == 1) {
//             System.out.println("Tarnsfer disk " + n +" from " + src + " to " + dest);
//              return;
//         }
        
//         towerOfHanoi(n - 1, src, dest, helper); 
//         System.out.println("Tarnsfer disk " + n + "from" + src + "to" + dest);
    
//         towerOfHanoi(n - 1, helper, src, dest);

//     }

//     public static void main(String args[]) {
//         int n = 4;

//         towerOfHanoi(n, "S", "T", "D");

//     }
// }


//Reverse of the string...


// public class recursion {
//     public static void reverseName(String name,int index) {
//         if(index==0){
//             System.out.print(name.charAt(index));
//             return;
//         }
//         System.out.print(name.charAt(index));
//         reverseName(name, index-1);
//     }

//     public static void main(String args[]) {
//        String name = "Oscar";
//        reverseName(name, name.length()-1);
//     }
// }

//Find the occurrence of the first and last occurrence of an element using recursion.

public class recursion {
    public static int first = -1; // To store the first occurrence of the element
    public static int last = -1;  // To store the last occurrence of the element

    public static void findOccurrence(String name, int index, char element) {
        // Base case: Stop recursion when the index reaches the end of the string
        if (index == name.length()) {
            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
            return;
        }

        // Check if the current character matches the element
        if (name.charAt(index) == element) {
            // Update 'first' only if it has not been updated yet
            if (first == -1) {
                first = index;
            }
            // Always update 'last' to the current index
            last = index;
        }

        // Recursive call to check the next character
        findOccurrence(name, index + 1, element);
    }

    public static void main(String[] args) {
        String name = "aabsfasdbasdfadbfa"; // Input string
        char element = 'a'; // Character to find
        findOccurrence(name, 0, element); // Call the recursive method
    }
}
