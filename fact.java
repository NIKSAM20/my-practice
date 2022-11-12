import java.util.*;
public class fact {
    public static int facto(int n){
              
        if(n==0 || n==1){
            return 1;
        }
        int f= n*facto(n-1);
        return f;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        System.out.println(facto(n));
    }
}