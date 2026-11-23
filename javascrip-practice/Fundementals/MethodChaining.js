

let username = window.prompt("Enter your name");

username = username.trim().charAt(0).toUpperCase() + username.slice(1).trim().toLowerCase();

console.log(username);a