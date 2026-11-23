
const fruit = [{Name: "Apple" , weight: 500},
               {Name: "Banana" , weight: 100},
               {Name: "strawberry" , weight: 300},
               {Name: "pomegranate" , weight: 2500}

              ]

// fruit.push({Name: "Kiwi" , weight: "800g"});
// fruit.pop();
// fruit.splice(0 , 1); // array method
const result = fruit.filter((check) => (check.weight < 500))
console.log(result)
// console.log(fruit[0]);
// console.log(fruit[1]);
// console.log(fruit[2]);
// console.log(fruit[3]);