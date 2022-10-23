import java.util.*;
class Arraysquare {
    
    static void square(int arr[], int n){
        int sum=0;
        int sqsum=0;
        
        System.out.println("Sqaure of all numbers are: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]*arr[i]+" ");
        }
        System.out.println();

        for(int i=0; i<n; i++){
            sum= sum+arr[i];
        }
        System.out.println("Sum of array elements is: "+sum);

        for(int i=0; i<n; i++){
            sqsum=(arr[i]*arr[i]+sqsum);
        }
        System.out.println("Sum of square of elements is: "+sqsum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n= sc.nextInt();
        
        int arr[]= new int[n];
        System.out.print("Enter the numbers: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        square(arr,n);        
    }
}