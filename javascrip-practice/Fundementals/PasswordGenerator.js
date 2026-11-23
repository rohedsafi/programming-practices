
function PasswordGenerator(includeNumber , includeUpperCase){
    let getWords = [];
    let Password = [];

    let Numbers = "0123456789";
    let UpperCase = "ABCDEFGH";

    getWords += includeNumber ? Numbers : "";
    getWords += includeUpperCase ? UpperCase : "";

    for(let i = 0; i < 8 ; i++){
        let guess = Math.floor(Math.random() * getWords.length);
        Password += getWords[guess];
    }

    console.log(Password);

}

let includeNumber = true;
let includeUpperCase = true;

PasswordGenerator(includeNumber , includeUpperCase)



