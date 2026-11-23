//>>>------------- Practice ------------------<<<
// function outer (){
//     let count = 0;

//   /* return */ function inner(){ // First way
//         count++;
//         console.log("Num value" + count);
//     }
//     function getCount(){
//         console.log(`the current value of Count is ${count}`)
//     }

//     return {inner , getCount} //second way
// }

// let counter = outer();
// // counter(); // First way
// // counter();
// // counter();
// counter.inner(); // second day
// counter.inner();
// counter.inner();
// counter.inner();
// counter.getCount();

//  function Name(){
//          let name = "John";
//          return function getFullName() {
//             return name + " Doe";
//          }
//       }

//       let fullName = Name();
//       console.log(fullName());

//>>>>------------------ project ------------------------<<<<

function shop(){
    let account = 0;

    function sells(sellAmount){
       account += sellAmount;
       console.log(`sells Amount is ${sellAmount}$`);
    }

    function spend(spendAmount){
        account -= spendAmount;
        console.log(`Spend Amount is ${spendAmount}$`);
    }

    function display(){
        console.log(`the total account money is: ${account}$`);
        if(account > 0){
            console.log("this month is profitable");
        }else{
            console.log("Your cooked bro")
        }
    }

    return {sells , spend, display};
}

const get = new shop();
const get2 = new shop();
get2.sells(88);
get2.spend(55);
get.sells(200);
get.sells(50);
get.spend(80);
get.spend(250);
get.sells(60);
// get.sells(45);

get.display();
get2.display()
