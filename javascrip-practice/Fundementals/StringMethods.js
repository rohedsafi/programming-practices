

let Name = " Hello World";
// console.log(Name.charAt(1)); // This method get the character 

// console.log(Name.indexOf("W")); // it return the index number of character
// console.log(Name.lastIndexOf("o")); // it return the index number of last characte if there is many
// console.log(Name.length()); // it return the length of a String or array

// Name = Name.trim(); // it remove space before and after a String 
// console.log(Name);

// console.log(Name.repeat(4)); // It repeat a String within () how many want to repeat 

// let result = Name.startsWith(" "); // also endsWith().
//  and include() check if there is any space.
// if(result){
//     console.log("Your Name can't begin with space ' '")
// }else{
//     console.log(Name);
// }

// let PhoneNum = "123-456-7890";
// PhoneNum = PhoneNum.replaceAll("-" , "@");
// console.log(PhoneNum);


// String slicing = creating a substring
//                 from a portion of another String.
//                syntaxt = String.slice(start , end);
let fullname = "rohed@gmail.com" ;    // "Rohed Safi";
let firstName = fullname.slice(0 , fullname.indexOf("@"))    // (0 , 5);
let lastName = fullname.slice(fullname.indexOf("@") + 1)    //(-4)  //(6 , 10);

console.log(firstName);
console.log(lastName);





