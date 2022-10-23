import java.util.*;
class DigitCombinations {

    void combo(int arr[], int combos[]){
        int x=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(i!=j && j!=k && k!=i){
                        int comb=(arr[i]*10+arr[j])*10+arr[k];
                        int flag=0;
                        for(int l=0;l<6;l++){
                            if(combos[l]==comb){
                                flag=1;
                            }
                        }
                        if(flag==0){
                            combos[x++]=comb;
                        }
                    }
                }
            }
        }
        
        for(int i=0;i<combos.length;i++){
            if(combos[i]==0){
                break;
            }
            System.out.println(combos[i]);

        }
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[3];
        int combos[] = new int[6];
        System.out.println("Enter 3 Numbers: ");
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        
        DigitCombinations d=new DigitCombinations();
        d.combo(arr,combos);
    }
}