
// let numbers = [1, 2, 3, 4, 5];

// numbers.forEach(double);
// numbers.forEach(display);

// function double(element , index , arr){
//     arr[index] = element * 2;
// }

// function display(element , i){
//     console.log(i + ": " + element);
// }

const ToDos =[
    {text: "JavaScript", done: true},
    {text: "php", done: true},
    {text: "Laveral" , done: false}
]; 

const todolist = document.getElementById("todolist");

ToDos.forEach(todo => {
    const li = document.createElement("li");
    li.textContent = todo.text;
    
    if(todo.done){
        li.style.textDecoration = "line-through" ;
        li.style.color = "gray";
        // li.style.backgroundColor = "red"
    }
    todolist.appendChild(li);
}
)


