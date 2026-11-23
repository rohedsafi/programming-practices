
class Animal{
    constructor(Name , Age , speed){
        this.Name = Name;
        this.Age = Age;
        this.speed = speed
    }
    move(speed){
        console.log(`the ${this.Name} can move at ${speed}mph`);
    }
}

class Dog extends Animal{
    constructor(Name , Age ,speed , isAlive){
        super(Name , Age , speed);
        this.isAlive = isAlive;
    }
    run(){
        console.log(`the ${this.Name} can run`);
        super.move(this.speed)
    }
}
class Fish extends Animal{
    constructor(Name , Age , speed , canHunt){
        super(Name , Age , speed);
        this.canSwim = canHunt;
    }
    swim(){
        console.log(`the ${this.Name} can run`);
        super.move(this.speed)
    }
}

const dog = new Dog("Ree" , 2 , 45, true);
const fish = new Fish("goldfish" , 1 , 30 , false)

console.log(dog);
console.log(fish);
dog.run()
fish.swim()

