var Employee = /** @class */ (function () {
    function Employee(code, name) {
        this.empcode = 0;
        this.empName = "";
        this.department = "Accounts";
        this.empName = name;
        this.empcode = code;
        this.department = "abc";
    }
    Employee.prototype.display = function () {
        console.log("empcode=" + this.empcode);
        console.log("empname=" + this.empName);
        console.log("department" + this.department);
    };
    return Employee;
}());
var emp = new Employee(101, "Swati");
emp.display();
