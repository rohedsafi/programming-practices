
function Car(Model , year , color){
    this.Model = Model;
    this.year = year;
    this.color = color;
    this.show = function(){
        console.log(this.Model+ " "+ this.year +" "+ this.color );
    }
}

const car1 = new Car("BMW" , 2022 , "gray");
const car2 = new Car("Honda" , 2025 , "white")
const car3 = new Car("Corolla" , 2013 , "Black")



car1.show()
car2.show()
car3.show()

