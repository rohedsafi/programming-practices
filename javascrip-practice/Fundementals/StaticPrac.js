
class student{
     static studentCount = 0; 

      constructor(Name){
        this.Name = Name;
        student.studentCount++;
     }
}

const s1 = new student("khan");
const s2 = new student("Ali");
const s3 = new student("Rohed");
// console.log(s1.studentCount); // Static properties and Methods are not access by class objects.
console.log(s1.Name);
console.log(student.studentCount);
