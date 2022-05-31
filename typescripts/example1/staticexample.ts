class EmployeeDetails{
    static headcount : number=0;
    constructor(private name : string){
        EmployeeDetails.headcount++;
      //  this.headcount++;
    }
}

let obj1=new EmployeeDetails('John');
//console.log(obj1.headcount);
console.log(EmployeeDetails.headcount);
let obj2=new EmployeeDetails('Mohit');
//console.log(obj2.headcount);
console.log(EmployeeDetails.headcount);