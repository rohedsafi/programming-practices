
// element.addEventListner('typeOfevent = onclick', function())

const button = document.getElementById('remove')
const btn2 = document.getElementById("btn2")
const btn3 = document.getElementById("btn3")
const h1 = document.querySelector('h1')


function removeText() {
    if (h1.style.color == 'red') {
        h1.style.color = 'green';
    } else if (h1.style.color == 'green') {
        h1.style.color = 'blue';
    } else if (h1.style.color == 'blue') {
        h1.style.color = 'red';
    } else {
        // Default / initial colour (e.g., if it's not set yet)
        h1.style.color = 'red';
    }
}


function increaseSize(){
    h1.style.fontSize = '48px';

}
function decreaseSize(){
    h1.style.fontSize = '12px';

}
button.addEventListener('click' , removeText)
btn2.addEventListener('mouseover' , increaseSize)
btn3.addEventListener('click' , decreaseSize)

