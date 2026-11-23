

let arr = [ [1,2,3], 
            [4,5,6],
            [7,8,9] ]

arr.push([7],[8]);

for(let row of arr){
    let getAll = row.join(" "); // add space with each element
    console.log(...getAll);
}

console.log(...arr , [10,20,30]);