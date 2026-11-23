#include <iostream>
//input and output stream cin,cout,endl
#include <fstream>
// file stream : this file is used to write and read data from HDD.
// 1. ofstream : output file stream.
// 2. ifstream: input file stream.
// 3. fstream: This class is used for both input and output file.
using namespace std; // without this we must writes this => std::cin, std::cout, std::endl
main() { // program starting point
	//file opening
	//ofstream obj("file name");//constructor method 
	ofstream obj;
	obj.open("student_information.csv",ios::app);//using open function
	obj<<"No,F_Name,L_Name,F/Name,Address"<<endl;//<< Insertion Operator 
	int RollNo;
	string f_name, l_name, father_name, address;
	char check, print;
	do{
		cout<<"Enter your Roll number: ";
		cin>>RollNo;
		cout<<"Enter your First Name :";
		cin>>f_name;
		cout<<"Enter your last name :";
		cin>>l_name;
		cout<<"Enter your father name :";
		cin>>father_name;
		cout<<"Enter your address :";
		cin>>address;
		obj<<RollNo<<","<<f_name<<","<<l_name<<","<<father_name<<","<<address<<endl;
		obj.close();
		cout<<"Do you want to add another record (Y/N)?";
		cin>>check;
		
	}while(check == 'Y' || check == 'y');
	cout<<"Do you want to print this recoed (Y/N)?";
	cin>>print;
	char txt;
	if(print == 'Y' || print == 'y') {
		ifstream obj1;
		obj1.open("student_information.csv");
		while(!obj1.eof()){
			obj1.get(txt);
			cout<<txt;
		}
		obj1.close();
	} else {
		cout<<"your program is terminated!!!";
	}
	
}
 
