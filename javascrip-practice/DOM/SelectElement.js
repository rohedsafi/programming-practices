

// let paragraph = document.querySelectorAll('p'); // querySelectorAll returns a static NodeList of all elements that match the specified selector
// console.log(paragraph);

// paragraph.forEach((p) => {
//     p.style.color = 'blue';
//     p.style.fontSize = '20px';
//     p.style.fontFamily = 'Arial, sans-serif';
// });

// let query = document.querySelector('#name'); // querySelector returns the first element that matches the specified selector
// query.textContent = "Khan";
// query.style.color = "red";
// console.log(query);

// let getById = document.getElementById("myH1"); // getElementById returns the element with the specified ID
// console.log(getById);

let Main = document.getElementById('Main');
Main.setAttribute('id' , 'Paragraph'); // setAttribute sets the value of an attribute on the specified element. If the attribute already exists, it will be updated with the new value.
// Main.removeAttribute('id'); // removeAttribute removes the specified attribute from an element
console.log(Main.getAttribute('id'));

for(let i = 0; i < 5; i++){
    let ul = document.getElementById("ul");
    let li = document.createElement("li");
    li.textContent = `List Item ${i}`;
    ul.append(li); // append adds a node to the end of the list of children of a specified parent node
}

const listFirstItem = document.querySelector("li");
// listFirstItem.style.color = "green";

console.log(listFirstItem.innerHTML); // innerHTML returns the HTML content of an element as a string,
                                      //  including any nested elements and their content.
                                      //  It allows you to get or set the HTML structure within an element.


console.log(listFirstItem.textContent); // textContent returns the text content of an element and all its descendants.
                                        //  It retrieves the text as it appears in the document, without any HTML tags or formatting.
                                        //  It is useful for getting or setting the plain text content of an element.

console.log(listFirstItem.innerText); // innerText returns the visible text content of an element,
                                      //  taking into account CSS styles and layout. It retrieves the text as it appears to the user,
                                      //  excluding any hidden or non-visible text. It is useful for getting or setting the text that is actually displayed on the page.





