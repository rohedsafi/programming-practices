
/* rest parameters = (...rest) allow a function word with a varable 
                  number of arguments by bundling them into an array.

                  spread = expands an array into seperate Elements.
                  rest = bundles seperate elements into an array. */
                  
// what is rest parameters in javascript?
// Rest parameters is a feature in JavaScript that 
// allows a function to accept a variable number of arguments as an array.
//  It provides a way to handle functions that can take an indefinite number of parameters,
//  making it more flexible and convenient to work with.


function getinfo(...foods){ // Rest Parameters
    console.log(...foods); // Spread Operator
}
let food1 = "Kabab";
let food2 = "Palaw";
let food3 = "Beryani";
let food4 = "Rosh";
let food5 = "Pizza";

getinfo(food1, food2, food3, food4, food5);


function Num(...Numbers){
    let total = 0;
    for(let number of Numbers){
        total += number;
    }
    // console.log(total);
    return total;
}
let result = Num(86, 88,100,99,97,95) ;
console.log(`the total of achieved mark is ${result}`);

function CombineString(...strings){
    return strings.join(" ");
}

let get = CombineString("Mr:" ,"Rohed" , "Khan" , "Safi");
console.log(get)
