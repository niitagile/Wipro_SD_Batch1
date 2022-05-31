interface PersonDetails{
    firstname : string;
    lastname : string;
}

function getFullName(person : PersonDetails){
    return person.firstname+" "+ person.lastname;
}
let obj ={
    firstname : 'John',
    lastname : 'Doe'

};
console.log(getFullName(obj));