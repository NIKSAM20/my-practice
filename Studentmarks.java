import java.util.*;
class Studentmarks{

    static void sort(int arr[], int n){
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i]>40 && arr[i]<=50){
                System.out.println(arr[i]+"\t\tPASS");
            }
            else if(arr[i]>51 && arr[i]<75){
                System.out.println(arr[i]+"\t\tMERIT");
            }
            else if(arr[i]>75){
                System.out.println(arr[i]+"\t\tDISTICTION");
            }
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n= sc.nextInt();
        
        int arr[]= new int[n];
        System.out.print("Enter the marks: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        sort(arr,n);        
    }
}