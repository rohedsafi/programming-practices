
let btn = document.querySelector(".btn");
let quote = document.querySelector(".quote");
let person = document.querySelector(".person");

const quotes = [
    {
       quote: "The only way to do great work is to love what you do.",
        person: "Lonardos da Vinci"
    },
    {
        quote: "Innovation distinguishes between a leader and a follower.",
        person: "Abraham Lincoln"
    },
    {
        quote: "Your time is limited, so don't waste it living someone else's life.",
        person: "Steve Jobs"
    },
    {
        quote: "The best way to predict the future is to invent it.",
        person: "Alan Kay"
    },
    {
        quote: "Stay hungry, stay foolish.",
        person: "Mark Zuckerberg"
    }
];

btn.addEventListener("click", function(){
    let random = Math.floor(Math.random() * quotes.length);
    quote.innerText = quotes[random].quote;
    person.innerText = quotes[random].person;
});