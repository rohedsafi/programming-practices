#include <iostream>
using namespace std;

class Calculator {
public:
double num1,num2;
void number(){
    cout <<"enter first number:";
    cin>>num1;
    cout<<"enter second number:";
    cin>>num2;
}
void setadd(){
        number();
        cout<<"the addition of two number is :"<<num1 + num2;

    }
    void setsub(){
        number();
        cout<<"the addition of two number is :"<<num1 - num2;

    }
    void setmulti(){
        number();
        cout<<"the addition of two number is :"<<num1 * num2;

    }
    void setdivid(){
        number();
        cout<<"the addition of two number is :"<<num1 / num2;

    }
};
// class Add : public Calculator{
//     public:
//     void setadd(){
//         number();
//         cout<<"the addition of two number is :"<<num1 + num2;

//     }
//     void setsub(){
//         number();
//         cout<<"the addition of two number is :"<<num1 - num2;

//     }
//     void setmulti(){
//         number();
//         cout<<"the addition of two number is :"<<num1 * num2;

//     }
//     void setdivid(){
//         number();
//         cout<<"the addition of two number is :"<<num1 / num2;

//     }
// };
int main(){
    Calculator c;
    char choice;
    cout<<"Enter the symbol you want to calculate (+,-,*,/)";
    cin>>choice;
    switch (choice)
    {
    case '+':
        c.setadd();
        break;
    case '-':
        c.setsub();
        break;    
    case '*':
        c.setmulti();
        break;
    case '/':
        c.setdivid();
        break;   
    default:
        
        break;
    }
}
