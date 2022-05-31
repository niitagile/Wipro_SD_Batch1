abstract class EmployeeInfo{
    constructor(private name : string){}
    abstract getSalary():number;
    get sName():string{
        return`${this.name}`;
    }
}

//let emp=new EmployeeInfo("Ajinkya");
class FullTimeEmployee extends EmployeeInfo{
    constructor(name:string, private salary:number){
        super(name);
    }
        getSalary():number{
            return this.salary;
        
    }
}

let emp1=new FullTimeEmployee("Anil", 50000);
console.log(emp1.sName+" "+emp1.getSalary());