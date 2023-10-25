// this
// 일반(Normal) 함수는 호출 위치에서 따라 this 정의!
// 화살표(Arrow) 함수는 자신이 선언된 함수 범위에서 this 정의!
//Ex1
// const heropy = {
//     name: 'Heropy',
//     normal: function(){
//         console.log(this.name);
//     },
//     arrow: ()=> {
//         console.log(this.name);
//     }
// }
// heropy.normal();//호출시 해당객체는 heropy
// heropy.arrow();

// const amy = {
//     name: 'Amy',
//     normal: heropy.normal,
//     arrow: heropy.arrow
// }
// amy.normal();
// amy.arrow();

//Ex2
// function User(name){
//     this.name = name
// }
// User.prototype.normal = function(){
//     console.log(this.name);
// }
// User.prototype.arrow = () => {
//     console.log(this.name);
// }

// const heropy = new User('Heropy')

// heropy.normal();
// heropy.arrow();

//Ex3
const timer = {
    name: 'Heropy!!',
    timeout: function(){
        //setTimeout(함수, 시간)
        setTimeout(() => {
            console.log(this.name);
        },2000)
    }
}
timer.timeout()