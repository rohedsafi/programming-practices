
let ul = document.getElementById("ul")

// Parent Node and Parent Element
// console.log(ul.parentNode) // parentNode returns the parent node of the specified node in the DOM tree.
// console.log(ul.parentElement) // parentElement returns the parent element of the specified element in the DOM tree. If the parent node is not an element, it will return null.
// console.log(ul.parentNode.parentNode) // Returns the grandparent node.
// console.log(ul.parentElement.parentElement) // Returns the grandparent element.
// const html = document.documentElement;
// console.log(html.parentNode)
// console.log(html.parentElement )

// // CHILD NODES AND CHILD ELEMENTS
// ul.childNodes[3].style.color = 'red';
// ul.firstElementChild.style.backgroundColor = 'blue';
// console.log(ul.childNodes) // childNodes returns a live NodeList of child nodes of the given element. The NodeList includes all child nodes, including text nodes and comment nodes.
// console.log(ul.children) // children returns a live HTMLCollection of child elements of the given element. The HTMLCollection includes only element nodes, excluding text nodes and comment nodes.
// console.log(ul.firstChild)
// console.log(ul.lastChild)

// Sibling Nodes
const div = document.getElementById("div1")
const a = document.querySelector('a')
console.log(div.childNodes)
console.log(a.previousElementSibling)
console.log(a.nextElementSibling)
