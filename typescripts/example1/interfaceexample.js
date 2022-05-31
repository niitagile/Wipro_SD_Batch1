function getFullName(person) {
    return person.firstname + " " + person.lastname;
}
var obj = {
    firstname: 'John',
    lastname: 'Doe'
};
console.log(getFullName(obj));
