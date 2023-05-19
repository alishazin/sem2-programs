#include <iostream>
using namespace std;

class Calculator {
	
	public:
		
		double fnum;
		double snum;
		
	Calculator(double num1, double num2) {
		fnum = num1;
		snum = num2;
	}
		
	void calculate() {
		
		cout << fnum << " + " << snum << " = " << fnum + snum << endl;
		cout << fnum << " - " << snum << " = " << fnum - snum << endl;
		cout << fnum << " x " << snum << " = " << fnum * snum << endl;
		cout << fnum << " / " << snum << " = " << fnum / snum << endl;
		
	}
};

int main() {
	
	double num1, num2;
	
	cout << "Enter number one : ";
	cin >> num1;
	
	cout << "Enter number two : ";
	cin >> num2;
	
	Calculator calc1 = Calculator(num1, num2);
	
	calc1.calculate();
	
	return 0;
}
