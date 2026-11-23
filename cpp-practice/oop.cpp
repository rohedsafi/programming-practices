#include <iostream>
using namespace std;

class Car{
public:
   int plus;
  int setplus(int a){
    plus = a;
  }

};

class Call : public Car {
    public:
    int getplus(){
      return (plus + plus);
    }
   
};
int main(){
     Call B1;
     B1.setplus(5);
     cout<<"plus is:"<<B1.getplus();
    

}