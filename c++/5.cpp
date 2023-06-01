#include <iostream>
using namespace std;

class Color {
	public:
		string color;
		
	void printColor() {
		cout << "Color of car : " << this->color << endl;
	}
};

class Car: public Color {
	public:
		static int tires;
		string name;
		
	Car(string name, string color) {
		this->name = name;
		this->color = color;
	}
		
	void printName() {
		cout << "Name of car : " << this->name << endl;
	}
	
	void printTires() {
		cout << "Number of tires : " << this->tires << endl;
	}
};

int Car::tires = 4;

int main() {
	
	Car ferrari("Ferrari", "Red");
	
	ferrari.printName();
	ferrari.printColor();
	ferrari.printTires();
	
	return 0;
}
