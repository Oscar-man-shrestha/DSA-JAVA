// public class stringBuilder {
//     public static void main(String args[]){
//          StringBuilder sb=new StringBuilder("Tony");
//         // System.out.println(sb);

//         // //Character at index.
//         // System.out.println(sb.charAt(0));
        
//         // //Set char at index 0

//         // sb.setCharAt(0,'p');
//         // System.out.println(sb);
        
//         // simple insert.

//         // sb.insert(2,'k');
//         // System.out.println(sb);
         
//         //delet th extra.

//         // sb.delete(1,3);
//         // System.out.println(sb);
         

//         //end mah add.
        
//         // sb.append("e");
//         // System.out.println(sb);





//     }
    
// }



//                                          palindrome

// public class stringBuilder {
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("Oscar");


//         for(int i=0;i<sb.length()/2;i++){
//             int front =i;              //index : 0,1,2,3,...........,n
//             int back=sb.length()-i-1;  //index : n,..........,3,2,1

//             char frontChar = sb.charAt(front);
//             char backChar = sb.charAt(back);

//             sb.setCharAt(front, backChar);
//             sb.setCharAt(back, frontChar);

           
//         }
//         System.out.print(sb);
       
//     }
    
// }



    // Note :Steps

    // front ko index
    // back  ko index
    
    // charAt (index) bata alphabet leu 
    // ani setCharAt bata character change gara front lai back deu back lai front deu.

