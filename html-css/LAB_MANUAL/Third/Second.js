



class Vehicle{
    constructor(brand , model , year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    getInfo(){
        // return `Car brand  ${this.brand} Model ${this.model} Made is ${this.year}`;
        console.log(`Car brand  ${this.brand} Model ${this.model} Made is ${this.year}`)
    }
}

class Car extends Vehicle{
    constructor(brand , model , year , NumDoors){
        super(brand, model , year)
        this.NumDoors = NumDoors;
    }

    getInfo(){
         return `Car brand  ${this.brand} Model ${this.model} Made is ${this.year} has ${this.NumDoors} doors`;
        //console.log( `Car brand  ${this.brand} Model ${this.model} Made is ${this.year} has ${this.NumDoors} doors`)
    }
}

class Motorcycle extends Vehicle{
    constructor(brand , model , year , engineCC){
        super(brand , model , year)
        this.engineCC = engineCC
    }

    getInfo(){
        return ` Car brand  ${this.brand} Model ${this.model} Made is ${this.year} has ${this.engineCC} engine power`;
      // console.log(`Car brand  ${this.brand} Model ${this.model} Made is ${this.year} has ${this.engineCC} engine power`)
    }
}



const car = new Car("BMW" , "M5"  , 2024 , 4);
car.getInfo()
const motorcycle = new Motorcycle("Hunda" , "Seven T" , 2018 , 150);
motorcycle.getInfo()

let hello = document.getElementById("get")
hello.textContent = car.getInfo()