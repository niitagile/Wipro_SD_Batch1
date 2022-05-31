class Employee{
    empcode : number=0;
    empName : string ="";
    readonly department : string="Accounts";
    constructor(code : number, name :string){
        this.empName=name;
        this.empcode=code;
        this.department="abc";
    }
    display(){
        //this.department="Sales";
        console.log("empcode="+this.empcode);
        console.log("empname="+this.empName);
        console.log("department"+this.department);

    }
}
let emp=new Employee(101, "Swati");
emp.display();
//emp.department="sales";
emp.empcode=123;