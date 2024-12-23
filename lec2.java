import java.util.*;  //package (pre-written code which we can use it in our code)

public class lec2{
    public static void main (String args[]){
        

        int a =10;
        int b=5;
        int ans=a*b/a-b;
        System.out.println(ans);          //left to right

        int answer =(a*b)/(a-b);
        System.out.println(answer);       //value will be solved which is inside parenthesis

        Scanner sc =new Scanner(System.in);
        String name=sc.next();//takes only one token
        String namee =sc.nextLine();//takes all token
        System.out.println(name); 

    }
}