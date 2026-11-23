

let parches = window.prompt("Enter amount of parches ;");
let discount = parches > 100 ? 10 : 0;
console.log(`You are discount is $${parches - parches * (discount/100)}`);