var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var EmployeeInfo = /** @class */ (function () {
    function EmployeeInfo(name) {
        this.name = name;
    }
    Object.defineProperty(EmployeeInfo.prototype, "sName", {
        get: function () {
            return "".concat(this.name);
        },
        enumerable: false,
        configurable: true
    });
    return EmployeeInfo;
}());
//let emp=new EmployeeInfo("Ajinkya");
var FullTimeEmployee = /** @class */ (function (_super) {
    __extends(FullTimeEmployee, _super);
    function FullTimeEmployee(name, salary) {
        var _this = _super.call(this, name) || this;
        _this.salary = salary;
        return _this;
    }
    FullTimeEmployee.prototype.getSalary = function () {
        return this.salary;
    };
    return FullTimeEmployee;
}(EmployeeInfo));
var emp1 = new FullTimeEmployee("Anil", 50000);
console.log(emp1.sName + " " + emp1.getSalary());
