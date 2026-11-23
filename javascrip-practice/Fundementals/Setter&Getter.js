

class Employee{
    constructor(Name , Salary){
        this.Name = Name;
        this.Salary = Salary;
    }
    set Name(newName){
        if(typeof newName === "string" && newName.length > 0){
            this._Name = newName;
        }else{
            console.error("Please Enter Character String")
        }
    }
    set Salary(newSalary){
        if(typeof newSalary === "number" && newSalary > 0){
            this._Salary = newSalary;
        }else{
            console.error("Please Enter Number")
        }
    }
    get Name(){
        return this._Name;
    }
    get Salary(){
        return this._Salary;
    }
    get All(){
        return `${this._Name} Salary amount is ${this._Salary}$ annually`
    }



}

const info = new Employee("Ali" , 10000);

console.log(info.Name);
console.log(info.Salary);
console.log(info.All);