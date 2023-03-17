#include <iostream>
using namespace std;

class MyClass {
	
	public:
		
	int myNum;
	string myString;
};

int main() {
	
	MyClass myObj;
	
	myObj.myNum = 10;
	myObj.myString = "String is an array of characters";
	
	cout << myObj.myNum << endl;
	cout << myObj.myString << endl;
	
	return 0;
}
