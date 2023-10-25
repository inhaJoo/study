//즉시 실행함수
// IIFE Immediately-Invoked Function Expression

const a = 7;
function double(){
    console.log(a * 2);
}
double();//끝났다는 표시를 ;

(function(){
    console.log(a * 2);
})();

(function(){
    console.log(a * 2);
}());