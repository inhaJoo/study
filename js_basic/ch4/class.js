// ES6 Classes
//Ex1
// const heropy = {
//     name: 'Heropy',
//     normal(){
//         console.log(this.name);
//     },
//     arrow: ()=> {
//         console.log(this.name);
//     }
// }

// heropy.normal();
// heropy.arrow();

//Ex2
// function User(first, last){
//     this.firstName = first
//     this.lastName = last
// }

// User.prototype.getFullName = function() {
//     return `${this.firstName} ${this.lastName}`
// }

//ES6 문법
class User{
    constructor(first, last) {
        this.firstName = first
        this.lastName = last
    }
    getFullName() {
        return `${this.firstName} ${this.lastName}`
    }
}

const heropy = new User('Heropy', 'Park');
const amy = new User('Amy', 'Clarke')
const neo = new User('Neo', 'Smith');

console.log(heropy);
console.log(amy.getFullName());
console.log(neo.getFullName());