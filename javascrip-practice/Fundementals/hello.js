
let fullname = "Khan";
let ID = 515;
let student = true;

document.getElementById("name").textContent = `Your name is ${fullname}`;
document.getElementById("id").textContent = `you are ID number is ${ID}`;
document.getElementById("student").textContent = `Enrolled: ${student}`;


let num = 20;
// num = num + 10;
// console.log(`Sum ${num}`);

// num = num - 10;
// console.log(`Sub ${num}`);

// num = num * 3;
// console.log(`Multi ${num}`);

num = num / 4;
console.log(`David ${num}`);


// let input ;
// input = window.prompt("what is your name: ");
// console.log(input);

var Name;
var Id;
var semester;

document.getElementById("mySubmit").onclick = function() {
    Name = document.getElementById("myName").value;
    console.log(Name);

    Id = document.getElementById("myID").value;
    console.log(Id);

    semester = document.getElementById("mySemester").value;
    console.log(semester);

    document.getElementById("myH1").textContent = `Welcome ${Name} `;
    alert("The data is store successfully")
}

// document.getElementById("mySubmit").onclick = function(){
//     Id = document.getElementById("myID").value;
//     console.log(Id);
// }

// document.getElementById("mySubmit").onclick = function(){
//     semester = document.getElementById("mySemester").value;
//     console.log(semester);
// }
