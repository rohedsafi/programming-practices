
const studentList = [
    {id: 101 , name: "Khan" , gpa: 3.5},
    {id: 101 , name: "Khan" , gpa: 3.5},
    {id: 101 , name: "Khan" , gpa: 3.5},
]

function fetchStudent( delay = 2000){
    return new Promise((resolve , reject)=>{
        setTimeout(() => {
            let success = true;
            if(success)
                resolve(studentList);
            else
                reject("Error: Unable to fetch student data");
            
        }, delay);

    })
}
