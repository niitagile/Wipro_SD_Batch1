var EmployeeDetails = /** @class */ (function () {
    function EmployeeDetails(name) {
        this.name = name;
        EmployeeDetails.headcount++;
        //  this.headcount++;
    }
    EmployeeDetails.headcount = 0;
    return EmployeeDetails;
}());
var obj1 = new EmployeeDetails('John');
//console.log(obj1.headcount);
console.log(EmployeeDetails.headcount);
var obj2 = new EmployeeDetails('Mohit');
//console.log(obj2.headcount);
console.log(EmployeeDetails.headcount);
