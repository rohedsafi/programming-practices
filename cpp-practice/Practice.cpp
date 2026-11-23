#include <iostream>
using namespace std;
class khan{
public:
int num;
    void setnum(){
    cout<<"enter a number: ";
    cin>>num;
    }
    void getnum(){
        cout<<"You enter: "<<num<<endl;
        cout<<"The multi of Num is :"<<num * num <<endl;
    }
};
int main(){
    khan a;
    a.setnum();
    a.getnum();
}