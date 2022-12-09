#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t, a, b;
	cin >>t;
	while(t!=0){
	    cin >>a >>b;
	    if(a>=b){
	        cout <<7-a <<"\n";
	    }
	    else{
	        cout <<7-b <<"\n";
	    }
	        
	    
	    t--;
	}
	return 0;
}