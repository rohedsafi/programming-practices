let Increment = document.getElementById("incrementBtn");
let Reset = document.getElementById("resetBtn");
let decrement = document.getElementById("decrementBtn");
let CountLabel = document.getElementById("countlabel");

let Plus = document.getElementById("tenPlus");
let Mines = document.getElementById("tenMines");

let count = 0;

Increment.onclick = function(){
    count++;
    CountLabel.textContent = count;
}

decrement.onclick = function(){
    count--;
    CountLabel.textContent = count;
}

Reset.onclick = function(){
    count = 0;
    CountLabel.textContent = count;
}

Plus.onclick = function(){
    count += 10;
    CountLabel.textContent = count;
}
Mines.onclick = function(){
    count -= 10;
    CountLabel.textContent = count;
}

