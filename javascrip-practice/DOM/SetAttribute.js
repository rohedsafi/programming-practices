//>>>>> Modifying attributes and classes of an element <<<<<<<

// let Main = document.getElementById('Main');
// Main.setAttribute('id' , 'Paragraph'); // setAttribute sets the value of an attribute on the specified element. If the attribute already exists, it will be updated with the new value.
// // Main.removeAttribute('id'); // removeAttribute removes the specified attribute from an element
// // const title = document.querySelector('Paragraph'); 
// console.log(Main.getAttribute('id')); // getAttribute get 


// MODIFYING CLASSES OF AN ELEMENT
const ul = document.getElementById("ul");
let li = document.createElement("dd")
let l = document.createElement("dd");
let i = document.createElement("dd")
ul.append(li);
ul.append(i)
ul.append(l)

li.innerText = 'New List Item';
i.innerText = 'Second Item';
l.innerText = 'Another List Item'

li.classList.add('list-item');
li.classList.add('list-item');
i.classList.add('list-item')
l.classList.add('list-item');


// li.classList.remove("list-item"); // remove style of list-item
// console.log(ul)


