
export function add(a , b){
    if(typeof a == 'number' && typeof b == 'number'){
    return console.log(a + b);
    }else{
        console.log("Invalid input only Please enter only number")

    }
}

export function subtract(a , b){
    if(typeof a == 'number' && typeof b == 'number'){
    return a - b;
    }else{
        console.log("Invalid input only Please enter only number")

    }
}
export function multiplication(a , b){
   if(typeof a == 'number' && typeof b == 'number'){
    return a * b;
    }else{
        console.log("Invalid input only Please enter only number")

    }
}
export function division(a , b){
    if(typeof a == 'number' && typeof b == 'number' && b > 0 && a > 0){
    return a / b;
    }else{
        console.log("Invalid input only Please enter only number")

    }
}