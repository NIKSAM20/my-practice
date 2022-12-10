#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t, a, b, c;
	cin >>t;
	while(t>0){
	    cin >>a >>b >>c;
	    if (a>b && a>c){
	        cout <<"Alice\n";
	    }
	    else if(b>a && b>c){
	        cout <<"Bob\n";
	    }
	    else{
	        cout <<"Charlie\n";
	    }
	    
	    t--;
	}
	return 0;
}