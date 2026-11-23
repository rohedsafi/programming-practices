        
        
        let myText = document.getElementById("myText");
        let toFahrenheit = document.getElementById("toFahrenheit");
        let toCelsius = document.getElementById("toCelsius");
        let result = document.getElementById("result");
        let temp;

        let button = document.getElementById("button").onclick = function(){
            if(toFahrenheit.checked){
                temp = Number(myText.value);
                temp = temp * 9 / 5 + 32;
                result.textContent = Math.round(temp) + "°F";
            }else if(toCelsius.checked){
                temp = Number(myText.value);
                temp = (temp - 32) * (5/9);
                result.textContent = Math.round(temp) + "°C";
            }else{
                result.textContent = "select a unit";
            }
        }