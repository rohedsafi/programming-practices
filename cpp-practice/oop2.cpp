#include <iostream>
using namespace std;

class Car{
public:
   int plus;
  Car(int a){
    plus = a;
  }

};

class Call : public Car {
    public:
    Call(int a):Car(a){
    }
    int getplus(){
      return (plus + plus);
    }
   
};
int main(){
     Call B1(5);
     B1.getplus();
    

}