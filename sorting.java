


//                         //   Bubble sort



// public class sorting{
//     //function to print the sorted array
//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+ " "); 
//     }
//     System.out.println();
// }
//     public static void main(String args[]){
//         int arr [] ={8,7,5,4,2,3,1};

//         //Time complexity = 0(n^2)
//        //bubble sort
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                 if (arr[j]>arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }

//             }
//         }
    
       
// printArray(arr);
    
// }
// }


//                              Selecting sort


public class sorting{
    public static void printArray(int arr []){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={7,8,3,1,2};

        //time complexity =0(n^2)
        //selection sort
       
           for(int i=0;i<arr.length-1;i++){
            int smallest = i;
             for(int j=i+1;j<arr.length;j++){     //(n-1,n-2,n-3.......)
                if(arr[smallest]>arr[j]){    // 8>3
                 smallest=j;   //samllest = index(2);
                }
            }
            //swap

             int temp = arr[smallest];  //temp variable mah 3 halde
             arr[smallest]=arr[i];     //arr[2]=arr[1]  (3=8)
             arr[i]=temp;              //arr[1]=arr[smallest] vayo...

           }
  printArray(arr);
        }

    }
