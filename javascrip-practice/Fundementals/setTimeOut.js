
// setTimeout() = Is a method that schedule a function to run after delay in millisecond.
//                It is a synco operation used to delay code execution without freezing the browser.

//  clearTimeout(timeoutID) = can cancel a timeout before it trigger.

// setInterval() = repeat the process again and again after given time


//>>>>------------------- Practice -----------------------<<<<
// console.log("you will see a message after few second")
// function time(){
//     window.alert("after waiting")
// }
// setTimeout(time, 5000);

console.time("test")

const timeoutID = setTimeout(function(){window.alert("hello user")} , 5000);

clearTimeout(timeoutID);

setTimeout(()=> window.alert("Most will come") , 10000);


// ----------------------------------------
setInterval(myFunction, 1000);

function myFunction() {
  let d = new Date();
  document.getElementById("demo").innerHTML=
  d.getHours() + ":" +
  d.getMinutes() + ":" +
  d.getSeconds();
}

console.timeEnd("test")