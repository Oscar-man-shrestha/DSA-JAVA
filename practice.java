import java.util.*;;
public class practice {
    public static void Factorial (int n){
        int factorial =1;
        for (int i=n;i>=1;i--){
            factorial*=i; 
        }
        System.out.print(factorial);
        return ;
    }
    public static void main (Strings args[]){
        Scanner sc=new Scanner (System.in);
        int n =sc.nextInt();
Factorial(n);

    }


}