

const subscribe = document.getElementById("Subscribe");
const visaCard = document.getElementById("visaCard");
const masterCard = document.getElementById("masterCard");

let submit = document.getElementById("mySubmit");

let subText = document.getElementById("subText");
let payText = document.getElementById("payText");

submit.onclick = function () {

    subscribe.checked ? subText.textContent = `You are Subscribe` : subText.textContent = `You did not Subscribe yet`;

    // if(subscribe.checked){
    //     subText.textContent = `You are Subscribe`;
    // }else{
    //     subText.textContent = `You did not Subscribe yet`;
    // }

    if(visaCard.checked){
        payText.textContent = `You choose VisaCard for payment`;

    }else if(masterCard.checked) {
        payText.textContent = `You choose MasterCard for payment`;
        
    } else {
        payText.textContent = `Please choose one from above`;
    }
    
}
