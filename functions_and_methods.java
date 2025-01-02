// import java.util.*;
// public class functions_and_methods {
//     public static void printMyName(String name){
//         System.out.println(name);
//         return ;
//     }

//     public static void main (String args []){
//         Scanner sc = new Scanner (System.in);
//         String name =sc.next();
//         printMyName(name);//call function 
//     }
    
// }

//Enter 3 numbers from the user & make a function to print their average.

// import java.util.*;;
// public class functions_and_methods{
//     public static void average (int a,int b,int c){
//         int average=(a+b+c)/3;
//         System.out.println("The average is : " +average);
//         return ;
//     }
// public static void main (String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.print("a :");
//     int a=sc.nextInt();
//     System.out.print("b :");
//     int b=sc.nextInt();
//     System.out.print("c :");
//     int c=sc.nextInt();
//     average(a,b,c);
// }
// }


//Write a function to print the sum of all odd numbers from 1 to n.

// import java.util.*;
// public class functions_and_methods{
//     public static void oddSum(int n){
//         int sum=0;
//         for (int i=1;i<=n;i++){
//              sum+=(2*i-1);
//              System.out.print("The sum is :"+sum);


//         }
//         return ;

//     }
//     public static void main (String args []){
//         Scanner sc=new Scanner (System.in);
//         System.out.print("Enter a n value :");
//         int n=sc.nextInt();
//         oddSum(n);


//     }
// }





// public class functions_and_methods{
//       public static void main(String args[]){
//         do{
//             System.out.println("This loop if finite");
//         }
//         while(true);

//         }
//     }

// import java.util.*;
// public class functions_and_methods{
//     public static void countit(int a){
//         int postive =0;
//         int neagtive=0;
//         int zero=0;
//         String ans;
//         do{
//             Scanner sc=new Scanner(System.in);
//             System.out.print("Add a number you want to check :");
//             int check=sc.nextInt();
//             if(check<0){
//                 System.out.print("Its Negative");
//                 neagtive++;
//             }
//             else if(check>0) {
//                 System.out.print("Its Postive");
//                 postive++;

//             }
//             else{
//                 System.out.print("Its Zero");
//                 zero++;
//             }
//             System.out.print("Do you want to enter another number? (yes/no): ");
//              ans=sc.next();
//         }while(ans.equals("yes"));

//         System.out.println("\nSummary:");
//         System.out.println("Positive numbers: " + postive);
//         System.out.println("Negative numbers: " + neagtive);
//         System.out.println("Zeros: " + zero);
//         return ;

//     }
//     public static void main(String args[]){
  
//        countit(0);



//     }
//   }


//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

// import java.util.*;
// public class functions_and_methods{
//     public static void power (int n,int x){
//         int result=1;
//         for (int i=1;i<=n;i++){
//             result*=x;
//         }
//         System.out.println(result);
//         return ;
//     }
    

//     public static void main (String args[]){
//         Scanner sc=new Scanner (System.in);
//         System.out.print("Enter a power :" );
//         int n=sc.nextInt();
//         System.out.print("Enter a base :");
//         int x=sc.nextInt();
//         power(n, x);

//     }
// }



//GCD...

// import java.util.*;
// public  class functions_and_methods{
//     public static void Gcd(int r1,int r2){
//         int or1=r1;
//         int or2=r2;
//        while (r1%r2!=0){
//         int rem=r1%r2;
//         r1=r2;
//         r2=rem;
//        }
//        int gcd=r2;
//        int lcm=(or1*or2)/gcd;
//         System.out.println("The GCD of the Number is :"+gcd);
//         System.out.println("The LCM of the Number is :"+lcm);
//     }
//     public static void main (String args []){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Put the value for r1 :");
//         int r1=sc.nextInt();
//         System.out.print("Put the value for r2 :");
//         int r2=sc.nextInt();

//         Gcd(r1, r2);
//     }

// }

// //  Fibonacci Series of Numbers...

// import java.util.*;
// public class functions_and_methods{
//     public static void fibo(int n){
//         int FirstNum=0;
//         int SecondNum=1;
//         for(int i=1;i<=n;i++){
//             System.out.print(FirstNum+",");
//        int Fibonacci=FirstNum+SecondNum;
//        FirstNum=SecondNum;
//        SecondNum=Fibonacci;

//         }
          
//     }
//     public static void main (String args []){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a value for n :");
//         int n=sc.nextInt();

//         fibo(n);



//     }
// }


