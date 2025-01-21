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


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


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

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Find the occurrence of the first and last occurrence of an element using recursion.

// public class recursion {
//     public static int first = -1; // To store the first occurrence of the element
//     public static int last = -1;  // To store the last occurrence of the element

//     public static void findOccurrence(String name, int index, char element) {
//         // Base case: Stop recursion when the index reaches the end of the string
//         if (index == name.length()) {
//             System.out.println("First occurrence: " + first);
//             System.out.println("Last occurrence: " + last);
//             return;
//         }

//         // Check if the current character matches the element
//         if (name.charAt(index) == element) {
//             // Update 'first' only if it has not been updated yet
//             if (first == -1) {
//                 first = index;
//             }
//             // Always update 'last' to the current index
//             last = index;
//         }

//         // Recursive call to check the next character
//         findOccurrence(name, index + 1, element);
//     }

//     public static void main(String[] args) {
//         String name = "aabsfasdbasdfadbfa"; // Input string
//         char element = 'a'; // Character to find
//         findOccurrence(name, 0, element); // Call the recursive method
//     }
// }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Check if an array is sorted (strictly increasing). - O(n)

// public class recursion {
   
//     public static boolean isSorted(int arr [],int index) {
//         if(index==arr.length-1){
//             return true;
//         }
//         if (arr[index]<arr[index+1]) {
//             return isSorted(arr, index+1);
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         int arr []={1,2,3,4,5};
//         System.out.println(isSorted(arr,0)); 

//     }
// }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//   Move all ‘x’ to the end of the string. - O(n)


// public class recursion {
   
//     public static void moveAllX(String name,int index,int count,String newName) {
      
//         if(index==name.length()){
//             for(int i=0;i<count;i++){
//             newName+='a';
//         }
//         System.out.print(newName);
//         return;
//     }

//         char currCharacter = name.charAt(index);
//         if(currCharacter == 'a'){
//             count++;
//             moveAllX(name, index+1, count, newName);
//         }
//         else{
//            newName+=currCharacter;
//            moveAllX(name, index+1, count, newName);
//         }

//     }
//     public static void main(String[] args) {
//        String name = "abcbdbsbsdfbsabasfbasdfdsfababfadf";
//        moveAllX(name,0,0," ");
//     }
// }


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//  Remove duplicates in a string.

// public class recursion {
//     public static boolean [] map =new boolean[26];
   
//     public static void removeDuplicate(String word,int index,String newWord) {
//         if(index==word.length()){
//             System.out.println(newWord);
//             return;
//         }

//         char currentChar = word.charAt(index);
//         if(map[currentChar-'a']){
//             removeDuplicate(word, index+1, newWord);
//         }
//         else{
//             newWord+=currentChar;
//             map[currentChar-'a']=true;
//             removeDuplicate(word,index+1,newWord);
//         }

//     }
//     public static void main(String[] args) {
//        String word = "abbccddeeffgghhiijjkkmmnn";
//        removeDuplicate(word,0,"");
//     }
// }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
         //Q7. Print all the subsequences of a string.

//      Time complexity - O(2^n)


// public class recursion {
    
   
//     public static void subString(String str,int index,String newStr) {
//        if(index==str.length()){
//         System.out.println(newStr);
//         return;
//        }
//        char currChar = str.charAt(index);

//        //To Be
//         subString(str, index+1, newStr+currChar);
//         //Don't want to be
//         subString(str, index+1, newStr);
//     }

//     public static void main(String[] args) {
//         String str="abc";
//         subString(str,0,"");

//     }
// }


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
         
//Q8. Print all unique subsequences of a string.

// import java.util.HashSet;

// public class recursion {
//     public static void subString(String str,int index,String newStr,HashSet<String>set) {
//        if(index==str.length()){
//         if(set.contains(newStr)){  //set mah  new sub string exist garxa ? 
//             return;
//         }
//         else{
//             System.out.println(newStr);
//             set.add(newStr);
//             return;
//         }
        
//        }
//        char currChar = str.charAt(index);

// //        //To Be
//         subString(str, index+1, newStr+currChar,set);
//         //Don't want to be
//         subString(str, index+1, newStr,set);
//     }

//     public static void main(String[] args) {
//         String str="aaa";
//         HashSet<String> set=new HashSet<>();
//         subString(str,0,"",set);

//     }
// }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Print keypad combination
// ( 0 -> .;
// 1 -> abc
// 2 -> def
// 3 -> ghi
// 4 -> jkl
// 5 -> mno
// 6 -> pqrs
// 7 -> tu
// 8 -> vwx
// 9 -> yz
// )


// import java.util.HashSet;

// public class recursion {
//     public static String [] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
//     public static void printComb(String str,int index,String combination) {
   
// if(index==str.length()){
//     System.out.println(combination);
//     return;
// }
//         //for ex:string bata 32 ayo tesma mah index zero vayeko le 3 ayo
//     char currChar = str.charAt(index);
//     //for ex: ya bata 3 index mah vako charactera yo keypad bata [ghi]
//     String mapping = keypad[currChar-'0'];
//     //  for ex: ghi ko lagi loop lago
//     for(int i=0;i<mapping.length();i++){
// printComb(str, index+1, combination+mapping.charAt(i));
//     }
// }

//     public static void main(String[] args) {
//         String str="32";
        
//         printComb(str,0,"");

//     }
// }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
           
                    // Concepts imp

//Recursion -Advanced Level Questions.

//Print all permutations of a String.


public class recursion {

    public static void printPerm(String str,String permutation) {
        //base case
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
   for(int i=0;i<str.length();i++){ 
    char currChar = str.charAt(i);
    String newStr=str.substring(0, i)+str.substring(i+1);
    printPerm(newStr, permutation+currChar);
   }
    }

    public static void main(String[] args) {
        String str="abc";
        printPerm(str,"");
    }
}

