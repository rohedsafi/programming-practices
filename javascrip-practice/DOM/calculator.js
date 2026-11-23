let add = document.getElementById("button");
let taskContainer = document.getElementById("task-addCount");

add.addEventListener("click", function () {
    taskContainer.innerHTML = "";

    for (let i = 2; i <= 10; i++) {
        let task = document.createElement("div");
        task.classList.add("task");

        let table = "";
        for (let j = 1; j <= 10; j++) {
            table += `${i} x ${j} = ${i * j}<br>`;
        }

        task.innerHTML = `<strong>Table of ${i}</strong><br>${table}`;
        taskContainer.appendChild(task);
    }
});
