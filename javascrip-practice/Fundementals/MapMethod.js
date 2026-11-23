
/*    .map() = accepts a callback and applies that function
               to each element of an Array, then return a new array
*/

//====================================================
// let Cars = new Map([  //New Map() using constructor
//     ["BMW", 2020],
//     ["Bugatti", 2024],
//     ["Corolla", 2015]
// ]);

// Cars.set("Honda", 2010);

// console.log(Cars.get("Honda"));
// console.log(Cars.size);
// console.log(Cars.delete("Bugatti"));
// console.log(Cars.size);

// //---------------------------------------------------
const arr = [1, 2, 3, 4, 5 , 2, 2, 4, 1];

let num = arr.sort()
console.log(num)
const arrange = arr.reduce((total , nextElement) => {
    total[nextElement] = (total[nextElement] || 0) + 1;
        return total;
    
},{},);
console.log(arrange)

const newArr = arr.map(cube); // Create new array 
function cube(element){
    return Math.pow(element, 3);
}
console.log(newArr);

//----------------------------------------------------
const Names = ["Ali", "Khan", "Safi"];

const get = Names.map(element => element.toUpperCase()); //using arrow function

// function Up(element){
//     return element.toUpperCase();
// }
console.log(get);

