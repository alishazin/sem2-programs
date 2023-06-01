 #include <iostream>
 using namespace std;
 
 class BaseClass {
 	public:
 		virtual void display() {
 			cout << "This is display() method of BaseClass" << endl;
		}
		void show() {
			cout << "This is show method of BaseClass" << endl;
		}
		 
 };
 
  class DerivedClass: public BaseClass {
 	public:
 		void display() {
 			cout << "This is display() method of DerivedClass" << endl;
		}
		 
 };
 
 int main() {
 	
 	DerivedClass dr;
 	BaseClass &bs = dr;
 	
 	bs.display();
 	dr.show();
 	
 	return 0;
 }
