#include<iostream>
using namespace std;

int search(int arr[], int low, int high, int key){ 


    int mid=(low+high)/2;

    if(arr[mid]==key){
        return mid;
    }
    else if(key<arr[mid]){ 
        search(arr, 0, mid-1, key);
    }
    else if(key>arr[mid]){
        search(arr, mid+1, high-1, key);
    }
    else{
        return -1;
    }
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

    int key;
    cout<<"Enter the key to search: ";
    cin>>key;

    int x=search(arr, 0, n-1, key);
    if(x==-1){
        cout<<"Element not found";
    }
    else{
        cout<<"Element found at "<<x;
    }
}    