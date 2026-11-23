
const name = "Rohed Safi";
const rollNumber = "19454";
const department = "Software Engineering";

let greeting = `Hello, I am ${name} from ${department}.`;

const greetingHeading = document.getElementById("greeting");

greetingHeading.textContent = greeting;

const dateButton = document.getElementById("dateButton");

dateButton.addEventListener("click", function () {

    const currentDateTime = new Date();
    alert(`Current Date and Time:${currentDateTime.toLocaleString()}`);

});