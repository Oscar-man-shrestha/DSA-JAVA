//Take an array of names as input from the user and print them on the screen.

// import java.util.*;

// public class homework {
//     public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a size :");
//         int size=sc.nextInt();
//         String names[]=new String[size];

//         //This is input..
       
//         for (int i=0;i<size;i++){
//             System.out.print("Enter a names :");
//            names[i]=sc.next();
//         }
        
//         //This is Output..

//         for(int i=0;i<names.length;i++){
//             System.out.println("name" +(i+1)+ " "+"is : " +names[i]+ " ");
//         }


//     }
// }


//Find the maximum & minimum number in an array of integers. 


// import java.util.*;

// public class homework {
//     public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a size :");
//         int size=sc.nextInt();
//        int number[]=new int[size];

//         //This is input..
       
//         for (int i=0;i<size;i++){
//             System.out.print("Enter a names :");
//            number[i]=sc.nextInt();
//         }
//         int max=Integer.MIN_VALUE;
//         int min=Integer.MAX_VALUE;
        
//         //This is Output..

//         for(int i=0;i<number.length;i++){
//             if(number[i]<min){
//                 min=number[i];
//             }
//             if(number[i]>max){
//                 max=number[i];
//             }
           
//         }
//         System.out.println("The maximum number is :"+max);
//         System.out.println("The minimum number is :"+min);

//     }
// }


//Take an array of numbers as input and check if it is an array sorted in ascending order.

// import java.util.*;

// public class homework {
//     public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a size :");
//         int size=sc.nextInt();
//        int number[]=new int[size];

//         //This is input..
       
//         for (int i=0;i<size;i++){
//             System.out.print("Enter a number :");
//            number[i]=sc.nextInt();
//         }
        
//         boolean isAscending=true;
//         //This is Output..

//         for(int i=0;i<number.length-1;i++){
//             if(number[i]>number[i+1]){
//                 isAscending=false;
//                 break;
//             }
//         }
//         if(isAscending){
//             System.out.println("The array is sorted in ascending order");
//         }
//         else{
//             System.out.println("The array is not sorted in ascending order");
//         }
//         }

//     }

//Searching for an element x in a matrix.

// import java.util.*;

// public class homework {
//     public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a rows :");
//         int rows=sc.nextInt();
//         System.out.print("Enter a colums :");
//         int colums=sc.nextInt();
//        int number[][]=new int[rows][colums];

//         //This is input..
       
//         for (int i=0;i<rows;i++){
//             for(int j=0;j<colums;j++){
//             System.out.print("Enter a rows and columns :");
//            number[i][j]=sc.nextInt();
//         }
//         }
//         System.out.print("Enter a number you want :");
//            int x=sc.nextInt();
        
//         //This is Output..
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<colums;j++){
//                 if(number[i][j]==x){
//                     System.out.print("x found at location ("+ i +","+j+")");
//                 }
//             }
//         }

//         }

//     }


//SPIRAL

import java.util.*;

public class homework {
    public static void main (String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter a rows :");
    //     int rows=sc.nextInt();
    //     System.out.print("Enter a colums :");
    //     int colums=sc.nextInt();
    //    int numbers[][]=new int[rows][colums];

    //     //This is input..
       
    //     for (int i=0;i<rows;i++){
    //         for(int j=0;j<colums;j++){
    //         System.out.print("Enter a rows and columns :");
    //        numbers[i][j]=sc.nextInt();
    //     }
    //     }

    int numbers[][]={{1,2,3},{4,5,6},{7,8,9}};
    int rows=3,colums=3;


        int top=0;
        int down=rows-1;
        int left=0;
        int right=colums-1;
        int dir=0;

        while(left<=right && top<=down){ 
            if(dir==0){
                for (int i=left;i<=right;i++){
                    System.out.print(numbers[top][i]+" ");
                }
                top++;
            }
            else if(dir==1){
                for(int i=top;i<=down;i++){
                    System.out.print(numbers[i][right]+" ");
                    
                }
                right--;
            }
            else if(dir==2){
                for(int i=right;i<=left;i++){
                    System.out.print(numbers[down][i]+" ");
                   
                }
                down--;
            }
            else if(dir==3){
                for(int i=down;i<=top;i++){
                    System.out.print(numbers[i][left]+" ");
                   
                }
                left++;
               
            }
            dir=(dir+1)%4;

        }
        
        
    

        }

    }