// Callback function is a function that is passed as an argument to another function
//  and is executed after some operation has been completed.
//  It allows for asynchronous programming, where certain tasks can be performed without blocking the execution of other code.
// ----------------------------------------------------------------------------------------
function one(callback){
    console.log("Func 1")
    callback()
}

function two(callback){
    console.log("Func 2")
    callback()
}
function three(callback){
    console.log("Fun 3")
    callback()
}

one()

// >>>>>>--------------------- SetTimeout() ---------------------<<<<<<
let stocks = {
    fruit: ["Apple" , "Banana" , "Watermelon" , "Barry"],
    liquid: ["Water" , "Ice"],
    holder: ["cup" , "stick" , "cone"]
}

// let order = (fruit_name ,liquid_name, call_production) => {
//     setTimeout(()=>{
//         console.log(stocks.fruit[fruit_name])
//         console.log(stocks.liquid[liquid_name])
//         call_production()
//     },2000)
// }

// let production = () => {
//     setTimeout(()=>{
//         console.log("Production Started")

//         setTimeout(()=>{
//             console.log("The fruit has been Choped")
            
//             setTimeout(()=>{
//                 console.log(`${stocks.liquid[0]} and ${stocks.liquid[1]} was added` )

//                 setTimeout(()=>{
//                     console.log("The Machine was Started")

//                     setTimeout(()=>{
//                         console.log(`the ice cream was place on ${stocks.holder[0]} `)
//                     },2000)
//                 },1500)
//             },1000)
//         },2000)
//     }, 0)
// }b
// order(3 , 1 ,production)

// >>>>>--------------------------- Promise ---------------------------<<<<<<
let is_shop_open = true;
let order = (time , work) => {
    return new Promise((resolve , reject)=>{  // Promise take tree states
        if (stocks.fruit.length > 0 && is_shop_open){
            setTimeout(()=>{
                resolve(`${work}`)
            },time);
        }
        else{
            reject(console.log("Enter shop is closed or Fruit is not available"))
        }
    })
}
function displayMessage(message) {
    console.log(message);
}

async function prepareIceCream(){
    try {
        console.log("Order has been placed")
        let fruit =  await order(2000 , `${stocks.fruit[0]} was selected`)
        displayMessage(fruit)
        let liquid = await order(1000 , `${stocks.liquid[0]} and ${stocks.liquid[1]} was added`)
        displayMessage(liquid)
    } catch (Error) {
        console.log("error happened")
    }finally{
        console.log("Day ended, shop is closed")
    }
    
}

prepareIceCream()

//>>>>-------------------  using Promises and then-------------------<<<<<<
// order(2000 , ()=>console.log(`${stocks.fruit[0]} was selected`))

// .then(()=>{
//     return order(1000 , ()=>console.log("Production has started"))
// })
// .then(()=>{
//     return order(2000 , ()=>console.log("The fruit has been chopped"))
// })
// .then(()=>{
//     return order(1000 , ()=>console.log(`${stocks.liquid[0]} and ${stocks.liquid[1]} was added`))
// })
// .then(()=>{
//     return order(1500 , ()=>console.log("The Machine was Started")) 
// })
// .then(()=>{
//     return order(2000 , ()=>console.log(`the ice cream was place on ${stocks.holder[0]} `))
// })
// .catch(()=>{
//     console.log("Customer left")
// })
// .finally(()=>{
//     console.log("Day ended, shop is closed")
// })
