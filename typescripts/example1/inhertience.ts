class Person{
    name: string="";
    constructor(name:string){
        this.name=name;
    }
}
class Student extends Person{
    rollno: number=0;
    constructor(rollno: number, name: string){
       super(name);
        this.rollno=rollno;
       
    }
    display(){
        console.log(this.rollno+"   "+this.name);
    }
}
let student=new Student(101,"Anish");
student.display();