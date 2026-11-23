
class Book {
    constructor(title , auther , isbn , isAvailable = true ){
        this.title = title;
        this.auther = auther;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    display(){
       let status = this.isAvailable ? "Available" : "Not Available";
       console.log(`${this.title} is written by ${this.auther} (ISBN ${this.isbn}) Status: ${status}`);
    }

    checkOut(){
        if(this.isAvailable){
            this.isAvailable = false;
            console.log(`You have checkout ${this.title}`);
        }else{
            console.log(`Sorry ${this.title} is not Available`);
        }
    }

    returnBook(){
        this.isAvailable = true;
        console.log(`thank you for returning ${this.title}`)
    }

}

const book1 = new Book("Atomic Habits" , "Jemse Morgin" , "100201")
book1.display()
book1.checkOut()
book1.display()
book1.checkOut()
book1.returnBook()
book1.display()