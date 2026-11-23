/*
    Filter() = is a array method that:
    >>> goes through each element in an array
    >>> keeps only the elements that match a condition .
    >>> return a new array .
    >>> does NOT change the original array .
*/


const Names = ["ali","Khan","Safi","Ahmad"];

const getInfo = Names.filter(name => name.length <= 4);
console.log(getInfo);

const GetInfo = Names.filter(function(you){
    return you.length >= 4;
})
console.log(GetInfo);


const Numbers = [1,2,3,4,5,6,7,8,9,10];
const oddNumber = Numbers.filter(num => num % 2 !== 0);
console.log(oddNumber);