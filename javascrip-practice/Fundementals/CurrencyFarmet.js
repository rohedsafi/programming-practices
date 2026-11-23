 // toLocaleString() = returns a string with a language 
 //                   sensitive representation of a number.

let number = 1990323.390;

// number = number.toLocaleString("en-US");
number = number.toLocaleString("en-US" , {style: "currency" , currency: "USD"});


console.log(number)

