// what is spread operator in javascript?
// Spread operator is a feature in JavaScript that allows an iterable such as an array or string to be expanded into individual elements. 
// It provides a convenient syntax for unpacking values from data structures, making it easier to work with complex data.
// Spread Operator = ...  allow an iterable such as an 
//                   array or string to be expanded 
//                   into separate elements 
//                   (unpacks the elements)


let Name = ["Ali" , "Rohed" , "Yousaf"];
let LastName = ["Safi" , "Khan" , "Jan"];

let join = [...Name , ...LastName, "This is An Example of Spread Operator"];

console.log(join);

let MyName = "Rohed Safi";
let getName = [...MyName];
console.log(getName);


let numbers = [1,2,3,4,5];
let getMax = Math.max(...numbers);
let getMin = Math.min(...numbers);

console.log(getMax);
console.log(getMin)

let user = {
    name,
    age
}

let user2 =  {
    ...user,
    fatherName
}