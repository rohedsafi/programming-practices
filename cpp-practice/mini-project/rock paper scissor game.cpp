#include <iostream>
#include <ctime>
using namespace std;

char userchoice(){
	char player;
	do{
		cout<<"====== Rock Paper Scissor Game ======"<<endl;
		cout<<"====== Choose the following ======"<<endl;
	    cout<<"*************************************"<<endl;
	    cout<<" 'r' : for Rock"<<endl;
	    cout<<" 'p' : for Paper"<<endl;
	    cout<<" 's' : for scissor"<<endl;
	    cin>>player;
	}while(player != 'r' && player != 'p' && player != 's');
	
	return player;
 }
char computerchoice(){
	char num;
	
	srand(time(NULL));
	num = rand() % 3 + 1;
	
	switch(num){
		case 1:
			return 'r';
		case 2:
			return 'p';
		case 3:
			return 's';
	}
	return 0;
 }
void showchoice(char choice){
	switch(choice){
		case 'r' :
			cout<<"Rock"<<endl;
			break;
		case 'p':
		    cout<<"Paper"<<endl;
			break;
		case 's':
		    cout<<"Scissor"<<endl;
			break;	
	}
}
void chooseWinner(char player, char computer){
	
	switch(player){
		case 'r': 
	    	if(computer == 'r'){
			cout<<"it's tie";
		   }else if(computer == 'p'){
			cout<<"you lose";
		   }else{
			cout<<"you win";
	    	}
	     	break;
		case 'p': 
	    	if(computer == 'r'){
			cout<<"you win";
		   }else if(computer == 'p'){
			cout<<"it's tie";
		   }else{
			cout<<"you lose";
	    	}
	     	break;
	    case 's': 
	    	if(computer == 'r'){
			cout<<"you lose";
		   }else if(computer == 'p'){
			cout<<"you win";
		   }else{
			cout<<"it's tie";
	    	}
	     	break; 	
		}
	}
int main(){
	
	char player;
	char computer;
	player = userchoice();
	cout<<"Your choice is : ";
	showchoice(player);
	
	computer = computerchoice();
	cout<<"Computer choice is :";
	showchoice(computer);
	
	chooseWinner(player,computer);

}