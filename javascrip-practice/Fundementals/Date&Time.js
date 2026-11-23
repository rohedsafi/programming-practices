
const date = new Date();

document.getElementById("demo").innerHTML = date.toUTCString();

//>>>>----------------- GET THE DATE ----------------------<<<<
// const year = date.getFullYear();
// const  month = date.getMonth();
// const day  = date.getDate()
// const dayOFweek = date.getDay();
// const hours = date.getHours();
// const minute = date.getMinutes()

// console.log(year);
// console.log(month);
// console.log(day);
// console.log(dayOFweek);
// console.log(hours);
// console.log(minute);


//>>>>--------------- SET THE DATE -------------------<<<<

//  date.setFullYear(2025);
//  date.setMonth(10);
//  date.setDate(5)
//  date.setDay(5);
//  date.setHours(5);
//  date.setMinutes(44)

// console.log(date);

//>>>>>--------------Campier of date------------------<<<<<

const data2 = new Date("2024-10-9");
console.log(data2);

if(date > data2){
    console.log("happy New Year")
}




