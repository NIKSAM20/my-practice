import java.util.*;
public class Sumintegers {
    
    int sum(){
        int su=0;
        for (int i=41; i<250; i++){
            if(i%5==0){
                su=su+i;
            }
        }
        return su;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Sumintegers s1= new Sumintegers();
        System.out.println("Sum of the integer that are greater than 40 and less than 250 divisible by 5 is: ");
        System.out.println(s1.sum());
    }    
}