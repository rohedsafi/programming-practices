
let input = document.getElementById("text-input");
let addTask = document.getElementById("addTask")
let taskContainer = document.getElementById("task-cont");

let  Id = 0;
async function addNewTask() {
    const title = input.value;
      let task = document.createElement("div");
        task.classList.add("task");
        Id++;
       
   await fetch('http://localhost:8080/api/tasks' , {
        method: 'POST', 
        headers: { 'Content-Type': 'application/json'},
        body: JSON.stringify({ taskId: Id, taskTitle: title })
    });
   
     let li = document.createElement("li");
        li.innerText = `${title}`;
        task.appendChild(li);
        
        let checkButton = document.createElement("button");
        checkButton.innerText = "✔️";       
        checkButton.classList.add("checkTask");
        task.appendChild(checkButton);
       
        let deleteButton = document.createElement("button");
        deleteButton.innerText = " 🗑 ";
        deleteButton.classList.add("deleteTask");
        task.appendChild(deleteButton);

        checkButton.addEventListener("click", function() {
            li.style.textDecoration = "line-through";
            li.style.color = "gray";    
        });

        deleteButton.addEventListener("click", async function(id) {
            await fetch(`http://localhost:8080/api/tasks/delete/${id}`, {
                method: 'DELETE'
            });
            task.remove();
        });

        if(title === ""){
                alert("please enter a task");
        }else{
            taskContainer.appendChild(task);
        }

        input.value = "";

}
