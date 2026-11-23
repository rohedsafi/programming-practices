// what is destructuring in javascript? 
// Destructuring is a feature in JavaScript that allows you to extract
//  values from arrays or properties from objects and assign them to variables
//  in a more concise and readable way.

// It provides a convenient syntax for unpacking values from data structures, 
// making it easier to work with complex data.


//>>------ Swap two value -------<<
/*let a = 10;
let b = 20;
console.log(a);
console.log(b);

[a , b] = [b , a];

console.log(a);
console.log(b);*/


//>>-----Swap Array Element-------<<
/*const Names = ["Ali" , "Khan" , "Jamal" , "Kamal"];
console.log(Names);
[Names[0] , Names[2]] = [Names[2] , Names[0]];
console.log(Names);*/


//>>-----Assign Array Elements to variables-------<<
// const Names = ["Ali" , "Khan" , "Jamal" , "Kamal" , "Jan"];
// const [firstName , secondName , ...extraName] = Names;
// console.log(firstName);
// console.log(secondName);
// console.log(extraName);


//>>-----Extract value from object-------<<

// const person1 = {
//     firstName: "Rohed",
//     lastName: "Safi",
//     Age: 20,
//     job: "Student",
// }
// const person2 = {
//     firstName: "Ali",
//     lastName: "Khan",
//     Age: 40,
//     job: "Businessman",
// }

// const {firstName , lastName , Age , job} = person2;
// console.log(firstName);
// console.log(lastName);
// console.log(Age);
// console.log(job);


//>>----- Destructure in function parameters -------<<

function getinfo({firstName , lastName , Age , job}){
     console.log(`Name: ${firstName} ${lastName}`);
    
     console.log(`Age: ${Age}`);
     console.log(`Job: ${job}`);
}
const person1 = {
    firstName: "Rohed",
    lastName: "Safi",
    Age: 20,
    job: "Student",
}

getinfo(person1);



