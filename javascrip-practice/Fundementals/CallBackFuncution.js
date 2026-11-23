
// function setData(num1 , num2 , callback){
//     setTimeout(function (){
//         let sum = num1 + num2;
//         console.log("The sum of two number is :");
//         callback(sum);
//     }, 3000)
// }
// function getData(data){
//     console.log("the operation has done",data)
// }

// setData(5 , 7, getData);

function SayHello(callback){ // example of callback function: good practice to use callback function in asynchronous programming.
    setTimeout( function() { // setTimeout is used to simulate asynchronous operation
       console.log("Hello Rohed");
       callback(); // callback function is called after the asynchronous operation is completed
    },5000) // 5000 milliseconds = 5 seconds
    
}

function Wait(){
    console.log("Wait");

}
function leave(){ 
    console.log("Please Leave");

}

SayHello(leave); // calling the function SayHello and passing the function leave as a callback function
Wait();
