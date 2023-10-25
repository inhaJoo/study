// //생성자함수(prototype)
// const heropy = {
//     firstName: 'Heropy',
//     lastName: 'Park',
//     getFullName:function(){
//         return `${this.firstName} ${this.lastName}`
//     }
// }
// console.log(heropy.getFullName());
// //this는 해당객체를 의미

// const amy = {
//     firstName: 'Amy',
//     lastName: 'Clarke',
//     getFullName: function(){
//         return `${this.firstName} ${this.lastName}`
//     }
// }
// console.log(amy.getFullName());

// const neo = {
//     firstName: 'Neo',
//     lastName: 'Smith',
//     getFullName: function(){
//         return `${this.firstName} ${this.lastName}`
//     }
// }

// console.log(neo.getFullName());

// //{} 객체 데이터는 만들어지는 갯수만큼 메모리에 할당됨
//생성자 함수는 파스칼 케이스로 맨 앞 대문자
function User(first, last){
    this.firstName = first
    this.lastName = last
}

user.prototype.getFullName = function() {
    return `${this.firstName} ${this.lastName}`
}

const heropy = new User('Heropy', 'Park');
const amy = new User('Amy', 'Clarke')
const neo = new User('Neo', 'Smith');
console.log(heropy.getFullName());
console.log(amy.getFullName());
console.log(neo.getFullName());

// {} 리터럴