
// const person = {
//     fullName: "Rohed Safi",
//     Age: 20,
//     isStudent: false,

//     address: {
//         Street: "3rd st Araban",
//         city: "Jalalabad",
//         country: "Afghanistan",

//         home:{
//             rooms: "3 rooms",
//             bathroom: 3,
//             floors: 1
//         }
//     }
// }
// console.log(person.fullName);
// console.log(person.Age);
// console.log(person.isStudent);
// console.log(person.address.home);
// console.log(person.address.home.rooms);

//>>>>>--------------------- 2 EXAMPLE --------------------------------<<<<<

class Person{
    constructor(fullName , age , ...address){
        this.fullName = fullName;
        this.age = age;
        this.address = new Address(...address)
    }
}

class Address{
    constructor(street , city , country){
        this.street = street;
        this.city = city;
        this.country = country;
    }
}

const person1 = new Person("Hasib Noorzai" , 20 , "2 st cheknori" , "Jalalabad" , "Afghnistan");

console.log(person1.fullName);
console.log(person1.age);
console.log(person1.address.city);

