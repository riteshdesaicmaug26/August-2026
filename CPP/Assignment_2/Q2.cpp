/*
 * Q2.cpp (Hospital Patient Registry)
 *
 *  Created on: 02-Sept-2026
 *      Author: Ritesh
 */

#include <iostream>
using namespace std;

class Patient{

private:
	int patientId;
	string name;
	int age;
	string ward;
	const string bloodGroup;

public:
	// Constructor 1 — Default: id=0, name="Unknown", age=0, ward="General",
	Patient(const string& bg = "NA")
	: patientId(0),
	  name("Unknown"),
	  age(0),
	  ward("General"),
	  bloodGroup("O+") {
	  cout << "[Constructor] Default patient registered." << endl;
	}

	// Constructor 2 — Emergency admission: only id and name known
	Patient(int id, const string& name, const string& bg = "NA")
	      : patientId(id),
		    name(name),
       		age(0),
		    ward("General"),
			bloodGroup(bg) {

		cout << "[Constructor] Emergency: "<< this->name << endl;
	}


	// Constructor 3 — Full admission details
	Patient(int id, const string& name, int age, const string& ward, const string&
	bg)
	        : patientId(id),
			  name(name),
			  age(age),
			  ward(ward),
			  bloodGroup(bg) {

			  cout << "[Constructor] Full admission: " << this->name << endl;
	}


	// Destructor — print "Patient <name> discharged." when object is destroyed
	~Patient(){
		cout << "[Destructor] Patient " << this->name << " discharged." << endl;
	}

	void displayRecord()const{
		cout << endl;
		cout << "Patient Record:" << endl;
		cout << "  ID          : " << this->patientId<< endl;
		cout << "  Name        : " << this->name<< endl;
		cout << "  Age         : " << this->age<< endl;
		cout << "  Ward        : " << this->ward<< endl;
		cout << "  Blood Grp   : " << this->bloodGroup<< endl;
	}

	void transferWard(const string& newWard){
		this->ward = newWard;
		cout << "Ward Transfer: " << this->name << " -> " << newWard << endl;
	}

};



int main(){

	//Stack Objects
	Patient p3(1001, "Meera Joshi", 34, "Cardiology", "B+");
	Patient p2(0, "Raj Patel");
	Patient p1("O+");
	p3.displayRecord();
	cout << endl;
	cout << endl;


	//Heap Objects
	int size = 4;
	Patient* ptr = new Patient[size];

	for(int i = 0; i < size; i++){
		(ptr + i)->displayRecord();
		cout << endl;
	}

	cout << endl;
	//Transfer One Ward
	p2.transferWard("ICU");

	//Delete the array
	delete[] ptr;

	return 0;
}


