import java.util.*;
public class practice_array {
    public static void main (Strings args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Size :");
        int size=sc.nextInt();

        int array[]=new int [size];

        //input
        for(int i=0;i<size;i++){
            System.out.print("Enter a array values :");
            array[i]=sc.nextInt();
        }

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        //Output
        for (int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
            
        }
        System.out.println("The minimum value is :"+min);
        System.out.println("The maximum value is :"+max);

    }
    
}
  //sabai vanda largest number tah xadaixa tara max mah save vako xa smaller ra smaller vanda ni thulo koi number halya xa vane tyo naya max xa