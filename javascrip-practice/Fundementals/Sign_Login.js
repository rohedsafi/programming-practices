

let logging = false;

let signButton = document.getElementById("SignButton");
if(signButton){
    signButton.onclick = function(){
        let userName = document.getElementById("UserInput").value;
        let Password = document.getElementById("PassInput").value;
        
        let users = JSON.parse(localStorage.getItem("users")) || [];
        
        users.push({ username: userName, password: Password });
        
        localStorage.setItem("users" , JSON.stringify(users));
        
        alert("You sign up successfully");
        //  for(let i = 0 ; i <= userName.length ; i++){
            //  console.log(userName[i]);
    // 
     document.getElementById("UserInput").value = "";
     document.getElementById("PassInput").value = "";
}
};

let logButton = document.getElementById("LogButton");
if(logButton){
    logButton.onclick = function(){
        let getUser = document.getElementById("GetUser").value;
        let getPass = document.getElementById("GetPass").value;
        
        let users = JSON.parse(localStorage.getItem("users")) || [];
        
        let found = false;
        for(let i = 0 ; i < users.length ; i++){
            if(users[i].username === getUser && users[i].password === getPass){
                console.log("Your logging successfully");
                found = true;
                break;
            }
        }
        if(found){
            alert("Login successfully");
        }else{
            alert("invalid user name or password");
        }

        document.getElementById("GetUser").value = "";
        document.getElementById("GetPass").value = "";

    }
};
    
    