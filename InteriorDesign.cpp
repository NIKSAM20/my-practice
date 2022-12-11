#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t, x1, x2, y1, y2;
	cin >>t;
	while(t>0){
	    cin >>x1 >>y1 >>x2 >>y2;
	    if((x1+y1)<=(x2+y2)){
	        cout <<x1+y1 <<"\n";
	    }
	    else{
	        cout <<x2+y2 <<"\n";
	    }
	    
	    t--;
	}
	return 0;
}