// Defining an arrray..

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

import java.util.*;
public class array{
    public static void main (String args []){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter size of Array :");
       int size=sc.nextInt();
       int numbers[]=new int [size];

       //input..
        for(int i=0;i<size;i++){
            System.out.print("Enter Input :");
            numbers[i]=sc.nextInt();
        }

        //output..

        for(int i=0;i<size;i++){
            System.out.print("This is Your Output :");
            System.out.println(numbers[i]);
        }
    }
}