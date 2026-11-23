

const student = {
    // Object Properties
    Name: "Jan",
    F_Name: "Khan",
    Class: "M01",
    age: 21,
    Marks: 540,


    // Object Method
    average: function(){
        console.log("Name :" + this.Name + "  Father Name :"+ this.F_Name);
        console.log(this.Marks / 6);

    }
}


 function getInfo(element){
    this.element = element; 
    console.log(element);
}
getInfo(80);


// console.log(student.Class);
// console.log(student.Marks);
console.log(student.average());