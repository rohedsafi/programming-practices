


function getSum(first , second){
    var sum = first + second;
    document.writeln("The sum of " + first + " and " + second + " is " + sum);
}
var first = 10;
var second = 20;
getSum(first,second);
alert("hello");
alert ("You enter wrong number");
console.log(first);

//---------Function Expression
const info = function (a , b){
    return a + b;
}
info(5 ,10)
console.log(info)

//-----------Arrow Function---------
const print = (a,b) => a * b; 
print(3 , 4)
console.log(print)


