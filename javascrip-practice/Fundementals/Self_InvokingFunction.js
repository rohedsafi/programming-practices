
// Self-Invoking Function example.
//  let out = document.getElementById("myH1");
// (function(name){
//     out.textContent = `Hello ${name}`
// })("Rohed");


// Arrow Function Example.
// let get = (name) => {
//     let get = document.getElementById("myH1");
//     get.innerHTML = `Hello ${name}`;
// }
// get("Ali Jan");


// Function call() Example

function Practice(one , two){
    return(this.num1 + this.num2 + one + two);
    // let get = document.getElementById("myH1")
    // get.textContent = (num1 + num2 + one + two);

}
let obj = {
    'num1': 7,
    'num2': 10,
}

let total = Practice.call(obj, 30 , 20);
 document.getElementById("myH1").textContent = `The Total value is ${total}`







