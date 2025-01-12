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

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//SPIRAL...

// import java.util.*;

// public class homework {
//     public static void main (String args[]){
//     //     Scanner sc=new Scanner(System.in);
//     //     System.out.print("Enter a rows :");
//     //     int rows=sc.nextInt();
//     //     System.out.print("Enter a colums :");
//     //     int colums=sc.nextInt();
//     //    int numbers[][]=new int[rows][colums];

//     //     //This is input..
       
//     //     for (int i=0;i<rows;i++){
//     //         for(int j=0;j<colums;j++){
//     //         System.out.print("Enter a rows and columns :");
//     //        numbers[i][j]=sc.nextInt();
//     //     }
//     //     }

//     int numbers[][]={{1,2,3},{4,5,6},{7,8,9}};
//     int rows=3,colums=3;


//         int top=0;
//         int down=rows-1;
//         int left=0;
//         int right=colums-1;
//         int dir=0;

//         while(left<=right && top<=down){ 
//             if(dir==0){
//                 for (int i=left;i<=right;i++){
//                     System.out.print(numbers[top][i]+" ");
//                 }
//                 top++;
//             }
//             else if(dir==1){
//                 for(int i=top;i<=down;i++){
//                     System.out.print(numbers[i][right]+" ");
                    
//                 }
//                 right--;
//             }
//             else if(dir==2){
//                 for(int i=right;i<=left;i++){
//                     System.out.print(numbers[down][i]+" ");
                   
//                 }
//                 down--;
//             }
//             else if(dir==3){
//                 for(int i=down;i<=top;i++){
//                     System.out.print(numbers[i][left]+" ");
                   
//                 }
//                 left++;
               
//             }
//             dir=(dir+1)%4;

//         }
        
        
    

//         }

//     }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                         Transpose of the matrix.


// import java.util.*;

// public class homework {
//     public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number of rows :");
//         int rows=sc.nextInt();
//         System.out.print("Enter number of colums :");
//         int columns =sc.nextInt();

//         int numbers [][] = new int [rows][columns];

//         //  Input. 
//         System.out.print("Enter numbers for input :");
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<columns;j++){
//                 System.out.print("Element [" + i + "][" + j + "]: ");
//                 numbers[i][j]=sc.nextInt();
//             }
            
//         }
        

//         // Output.

//         System.out.println("\nOriginal Matrix:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < columns; j++) {
//                 System.out.print(numbers[i][j] + " ");
//             }
//             System.out.println();
//         }

//         System.out.println("\nTranspose Matrix:");
//         for(int i=0;i<columns;i++){
//             for(int j=0;j<rows;j++){
//                 System.out.print(numbers[j][i]+" ");
//             }
//             System.out.println();
//         }

//         }

//     }



//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                    //Strings....
 

        //  import java.util.*;

        //  public class homework{
        //      public static void main(String args[]){
        //          String name="oscar";  
        //          String str = "123";
        //          int number =123;
        //          int no=Integer.parseInt(str);
        //        String st =Integer.toString(number);
        //        System.out.println(no);
        //          System.out.println(number);
                
        //              }
        //           }


 // import java.util.*;

// import java.util.*;
// public class homework{
//     public static void main(String args[]){
//        Scanner sc=new Scanner (System.in);
//        System.out.print("Enter Size :");
//        int size=sc.nextInt();
//        String names[]=new String [size];

//        int totalLenght=0;
//        for(int i=0;i<size;i++){
//         names[i]=sc.next();
//         totalLenght+=names[i].length();

//        }
//        System.out.print(totalLenght);
//             }
//          }
 //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------        
   //Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
      
// import java.util.*;
// public class homework{
//     public static void main(String args[]){
//        Scanner sc=new Scanner (System.in);
//        System.out.print("Enter Size :");
//        int size=sc.nextInt();
//        String names[]=new String [size];

//        int totalLenght=0;
//        for(int i=0;i<size;i++){
//         names[i]=sc.next();
//         totalLenght+=names[i].length();

//        }
//        System.out.print(totalLenght);
//             }
//          }
         

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

// import java.util.*;
// public class homework{
//     public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter a word :");
//        String word=sc.next();
//        String result="";
//        for(int i=0;i<word.length();i++){
//         if(word.charAt(i)=='e'){
//             result+='i';
//         }
//         else{
//             result+=word.charAt(i);
//         }

//        }
//        System.out.print(result);

//             }
//          }


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”

// import java.util.*;
// public class homework{
//     public static void main (String args []){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a Email :");
//         String email = sc.nextLine();
//         String userNames = "";
         
//         for(int i=0;i<email.length();i++){
//             if(email.charAt(i)=='@'){
//                 break;
//             }
//             else{
//                 userNames+=email.charAt(i);
//             }
//         }
// System.out.print(userNames);

//     }


// }


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//                           Bit Manipulation
// import java.util.*;
// public class homework{
//   public static void main (String args []){
// Scanner sc = new Scanner (System.in);
// System.out.print("Enter a number :");
// int n = sc.nextInt();
// if (isPowerOfTwo(n)) {
//   System.out.println(n + " is a power of 2.");
// } else {
//   System.out.println(n + " is NOT a power of 2.");
// }
// }


    
// public static boolean  isPowerOfTwo(int n){

//     return n>0 && (n&(n-1))==0;

      

//     }

  
//   }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
