

class product{
    constructor(Name , Price){
        this.Name = Name;
        this.Price = Price;
    }

    displayInfo(){
        console.log(`the price of ${this.Name} before tax ${this.Price.toFixed(2)}`);
    }

    CalculateTax(tax){
        return this.Price + (this.Price * tax);
    }
}

const taxRate = 0.10;

const product1 = new product("Shirt" , 12.99);
const product2 = new product("Jacket" , 45.49)

product1.displayInfo();
let total = product1.CalculateTax(taxRate);
console.log(total.toFixed(2));

product2.displayInfo();
let total2 = product2.CalculateTax(taxRate);
console.log(total2.toFixed(2));