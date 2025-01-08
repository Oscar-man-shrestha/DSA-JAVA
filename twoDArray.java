// import java.util.*;

// public class twoDArray {
//     public static void main (String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter a row :");
//         int rows =sc.nextInt();
//         System.out.print("Enter a row :");
//         int colm =sc.nextInt();

//         int [][] numbers = new int [rows][colm];

//         //...INPUT...

//         for(int i=0;i<rows;i++){
//             for(int j=0;j<colm;j++){
//                 System.out.print("Enter input :");
//                 numbers [i][j]=sc.nextInt();
//             }
//         }

//         //...OUTPUT...

//         for (int i=0;i<rows;i++){
//             for(int j=0;j<colm;j++){
//                 System.out.print(numbers[i][j]+" | ");
//             }
//             System.out.println();
//         }
//     }
// }


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;

public class twoDArray {
    public static void main (Strings args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a row :");
        int rows =sc.nextInt();
        System.out.print("Enter a colums :");
        int colm =sc.nextInt();

        int [][] numbers = new int [rows][colm];


        

        //...INPUT...

        for(int i=0;i<rows;i++){
            for(int j=0;j<colm;j++){
                System.out.print("Enter input :");
                numbers [i][j]=sc.nextInt();
            }
        }

        //what number's index you want ??
        System.out.print("want number's index :");
        int want =sc.nextInt();


        //...OUTPUT...

        for (int i=0;i<rows;i++){
            for(int j=0;j<colm;j++){
               if(numbers[i][j]==want){
                System.out.print("This is your number's Index : rows "+i+"colums"+j) ;
               }
            }
            System.out.println();
        }
    }
}