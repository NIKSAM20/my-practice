#include<iostream>
using namespace std;

int sum(int arr[], int n){
    int s=0;
    for(int i=0; i<n; i++){
        s=s+arr[i];
    }
    return s;
}

int main(){
    int n;
    cout<<"Enter the size: ";
    cin>>n;

    int arr[n];
    cout<<"Enter the elements: ";
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    int su=sum(arr, n);
    
    int max=arr[0], min=arr[0];

    for(int i=0; i<n; i++){
        
        if (arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }
    }
    cout<<"Maximum sum of elements is: "<<su-min<<endl;
    cout<<"Minimum sum of elements is: "<<su-max<<endl;
}