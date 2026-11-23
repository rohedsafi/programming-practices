
let logging = false;
let userName ;
let password;
let data = [ "khan" , "Lala"];
let PassData = [1212 , 4411 ];

while (!logging){
     userName = prompt("Enter your name ");
     password = Number(prompt("Enter Password"));
    let found = false;
for(let i = 0 ; i <= data.length ; i++){
    if(userName === data[i] && password === PassData[i]){
        console.log("Your logging successfully");
        logging = true;
        found = true;
        break;
    }
}
if(!found){
    console.log("invalid user name or password");
}
    
    
}



