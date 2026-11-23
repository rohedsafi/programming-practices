
let max = 100;
let min = 1;
let attempt = 0;
let guess;
let running = true;

let RandomNum = Math.trunc(Math.random() * (max - min)) + min;

while(running){

    guess = window.prompt("Enter a Number Between (1 - 100)")
    guess = Number(guess);
    if(isNaN(guess)){
        alert("invalid please Enter Number");
    }else if(guess < min && guess > max){
        alert("please Enter Number between 1 - 100")
    }else{
        attempt++
        if(guess < RandomNum){
            alert("Too low");
        }else if(guess > RandomNum){
            alert("Too high");
        }else{
            alert( `CORRECT! The random number is ${RandomNum} and found in ${attempt} attempt`);
            running = false;
        }
    }

    
}