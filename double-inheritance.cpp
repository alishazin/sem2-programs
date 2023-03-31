#include <iostream>
using namespace std;

class Address {
	public:
		string state;
		string country;
		
	void displayAddress() {
		cout << this->state << ", " << this->country << endl;
	}
};

class Education {
	public:
		string bac_degree;
		string mas_degree;
		
	void displayEducation() {
		cout << "Bachelor Degree : " << this->bac_degree << endl;
		cout << "Master Degree : " << this->mas_degree << endl;
	}
};

class Human: public Education, public Address {
	public:
		string name;
		int age;
		
	Human(string name, int age, string bac_degree, string mas_degree, string state, string country) {
		this->name = name;
		this->age = age;
		this->bac_degree = bac_degree;
		this->mas_degree = mas_degree;
		this->state = state;
		this->country = country;
	}
		
	void displayPersonalDetails() {
		cout << "Name : " << this->name << endl;
		cout << "Age : " << this->age << endl;
	}
};

int main() {
	
	Human p1("Ali Shazin", 18, "B.Tech", "M.Tech", "Kerala", "India");
	
	p1.displayPersonalDetails();
	p1.displayEducation();
	p1.displayAddress();
	
	return 0;
}
