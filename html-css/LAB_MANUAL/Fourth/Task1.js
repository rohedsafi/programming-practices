// function ValidateUsername (username){
//     return username;  
// }

// let MyPromise = (work , time)=> {
//     return new Promise((resolve , reject)=>{
//         if(ValidateUsername() === "admin"){
//             setTimeout(()=>{
//                 resolve(work);
//             },time);

//         }else{
//             reject(console.log("user is Invalid try again"))
//         }
//     })
    
// }

// MyPromise(ValidateUsername("admin") , 3000)
// .then()


function ValidateUsername(username){
    return new Promise((resolve , reject)=>{
        setTimeout(()=>{
            if(username === "admin"){
                resolve(console.log("UserName is valid"))
            }else{
                reject(console.log("UserName is Invalid try again"))
            }
        }, 1000)

    })
}
function CheckPassword(Password){
    return new Promise((resolve , reject)=>{
        setTimeout(()=>{
            if(Password === 2222){
                resolve(console.log("Password is valid"))
            }else{
                reject(console.log("password is Invalid try again"))
            }
        }, 1000)

    })  
}

function LoginUser(user){
    return new Promise((resolve , reject)=>{
        setTimeout(()=>{
            if(user == "admin"){
                resolve(console.log("Login Successfully"))
            }else{
                reject(console.log("Login Failed"));
            }
        }, 1000)

    })
}

ValidateUsername("admin" )
.then(()=>{
    return CheckPassword(2222)
})
.then(()=>{
    return LoginUser("admin")
})
.catch(Error)



