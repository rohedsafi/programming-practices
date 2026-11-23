
let lable = document.getElementById("lable")
let incre = document.getElementById("btnIncr")
let decre = document.getElementById("btnDecre")
let reset = document.getElementById("reset")

let count = 0

incre.onclick = function(){
    count++;
    lable.textContent = count;
}

decre.onclick = function(){
    count--;
    lable.textContent = count;
}

reset.onclick = function(){
    count = 0;
    lable.textContent = count;
}
