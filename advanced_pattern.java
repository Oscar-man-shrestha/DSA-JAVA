// public class advanced_pattern {
//     public static void main (String args []){
//         int n =4;
        
//         for (int i=1;i<=n;i++){
//             for(int j =1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for (int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
          
//             }
//             for(int j =1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i=n;i>=1;i--){
//             for(int j =1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for (int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
          
//             }
//             for(int j =1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         } 
//     }
    
// }

//    *      *
//    **    **
//    ***  ***
//    ********                pattern
//    ********
//    ***  ***
//    **    **
//    *      *



//Solid Rhombus...

// public class advanced_pattern{
//     public static void main (String args []){
//         int n=5;
//         for (int i=1;i<=n;i++){
        
//         for (int j=1;j<=n-i;j++ ){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=n;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// }

//     *****
//    *****
//   *****           pattern
//  *****
// *****

//Number Pyramid..

// public class advanced_pattern{
//     public static void main (String args []){
//         int n=5;
//         for (int i=1;i<=n;i++){
//             for (int j =1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for (int j =1 ;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();

//         }

//     }
// }

//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 


//Palindrome pattern

// public class advanced_pattern{
//     public static void main (String args[]){
//         int n=5;
//         for (int i=1;i<=n;i++){
//             for (int j =1;j<=n-i;j++){
//                 System.out.print(" ");
//             }

//             for (int j =i;j>=1;j--){
//                 System.out.print(j);
//             }
           
//                 for (int j=2;j<=i;j++){
//                     System.out.print(j);
//                 }
//                 System.out.println();
//             }
      
//     }
//     }

//      1
//     212
//    32123
//   4321234
//  543212345


// Diamond Pattern...

// public class advanced_pattern{
//     public static void main (String args []){
//         int n =4;
//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
            
//             for (int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
           
            
//           for (int j=2;j<=i;j++){
//                 System.out.print("*");
              
//             }
//             System.out.println();
//         }
//             for (int i=n;i>=1;i--){
//                 for(int j=1;j<=n-i;j++){
//                     System.out.print(" ");
//                 }
                
//                 for (int j=1;j<=i;j++){
//                     System.out.print("*");
//                 }
               
                
//               for (int j=2;j<=i;j++){
//                     System.out.print("*");
                  
//                 }
//                 System.out.println();
            
//             }
            
//     }


// }

//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *



//pascal triangle..


// 1
// 1 1
// 1 2 1 
// 1 3 3 1
// 1 4 6 4 1


public class advanced_pattern{
    public static void main (String args []){
        int n=5;
        int num=1;
        for (int i=0;i<=n;i++){
           for (int s=1;s<=n;s++){
            System.out.print(" ");
           }
           num =1;
           for (int j=0;j<=i;j++)
           {
            System.out.print(num+" ");
            num=num*(i-j)/(j+1);
           }

           
            System.out.println();
        }
       

    }
}
