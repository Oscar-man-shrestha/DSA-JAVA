//                         Defining an arrray..





// type[]typeName=new type[size];

// public class array{
//     public static void main (String args []){
//         // int [] marks=new int [3];
//         // marks[0]=97;
//         // marks[1]=98;
//         // marks[2]=65;
//         // System.out.print(marks);
// int n=3;
//         // int marks [] ={97,98,95};

//         int number []=new int [n];

//         for (int i=0;i<n;i++){
//             System.out.println(number[i]);
//         }
//     }

// }

//------------------------------------------------------------------------------------------------------------------------------------------------------------------


//Some examples..

// import java.util.*;
// public class array{
//     public static void main (String args []){


//        Scanner sc=new Scanner(System.in);

//        //Input size from user..

//        System.out.print("Enter size of Array :");
//        int size=sc.nextInt();

//        int numbers[]=new int [size];

//        //input..

//         for(int i=0;i<size;i++){
//             System.out.print("Enter Input :");
//             numbers[i]=sc.nextInt();
//         }

//         //output..

//         for(int i=0;i<size;i++){
//             System.out.print("This is Your Output :");
//             System.out.println(numbers[i]);
//         }
//     }
// }


//------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                      [ Linera search ]


// import java.util.*;
// public class array{

//     public static void main (String args []){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a Size :");
//         int Size = sc.nextInt();

//         int number []=new int [Size];

//         //Input...

//         for(int i=0;i<Size;i++){
//             System.out.print("Enter a value for index ");
//             number[i]=sc.nextInt();
//         }

//         //Asking which number's index you wanna know.

//         System.out.print("Enter a value to find index :");
//         int x=sc.nextInt();

//         //Output...

//         for(int i=0;i<Size;i++){

//             if(number[i]==x){
//                 System.out.print("index for the number is :"+i);
//             }

//         }

        
//     }
// }


// import java.util.*;


// public class array {
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int size = sc.nextInt();
//       int numbers[] = new int[size];


//       //input
//       for(int i=0; i<size; i++) {
//           numbers[i] = sc.nextInt();
//       }


//       int max = Integer.MIN_VALUE;
//       int min = Integer.MAX_VALUE;
     
//        for(int i=0; i<numbers.length; i++) {
//            if(numbers[i] < min) {
//                min = numbers[i];
//            }
//            if(numbers[i] > max) {
//                max = numbers[i];
//            }
//        }


//        System.out.println("Largest number is : " + max);
//        System.out.println("Smallest number is : " + min);
      
//    }
// }
//sabai vanda largest number tah xadaixa tara max mah save vako xa smaller ra smaller vanda ni thulo koi number halya xa vane tyo naya max xa



//  import java.util.*;
//  public class array {
//     public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter Size : " );
//        int size = sc.nextInt();


//        int numbers[] = new int[size];


//        //input
//        for(int i=0; i<size; i++) {
//            numbers[i] = sc.nextInt();
//        }
      
   
//         for(int i=0; i<numbers.length; i++) {
//             if(numbers[i]<numbers[i+1]){
//                 System.out.println("Sorted :" );
               
//             }
//             else{
//                 System.out.println("Not sorted :" );
//             }
//         }
       
    
//     }
//  }

//--------------------------------------------------------------------------------------------------------------------------------------------------------------


//                              2D Array..

// import java.util.*;
//  public class array {
//     public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter Size : " );
//        int rows = sc.nextInt();
//        int colm = sc.nextInt();


//        int number [][]=new int [rows][colm];


       //input
//        for(int i=0; i<; i++) {
//            numbers[i] = sc.nextInt();
//        }
      
   
//         for(int i=0; i<numbers.length; i++) {
//             if(numbers[i]<numbers[i+1]){
//                 System.out.println("Sorted :" );
               
//             }
//             else{
//                 System.out.println("Not sorted :" );
//             }
//         }
       
    
//     }
//  }