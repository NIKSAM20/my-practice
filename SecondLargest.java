import java.util.*;
public class SecondLargest {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t>0){
		    int sum=0;
		    int array[]=new int[3];
		    
		    //input
		    for(int i=0; i<3; i++){
		        array[i]=sc.nextInt();
		    }
		    int max=array[0];
		    int min=array[0];
		    
		    for(int i=0; i<3; i++){
		        sum=sum+array[i];
		        if(max<array[i]){
		            max=array[i];
		        }
		        if(min>array[i]){
		            min=array[i];
		        }
		    }
		    int sec=sum-min-max;
		    System.out.println(sec);
		    t--;
		}	    
	}
}