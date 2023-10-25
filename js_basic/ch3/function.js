//함수 복습
//기명함수
function sum(x, y){
    if(x < 2){
        return
    }
   //console.log(x + y); //리턴 값 뒤로 가면 실행되지 않음
   return x+y//return 시점 함수종료
}

const a = sum(1,3)
const b = sum(4, 12)
console.log(a);
console.log(b);
console.log(a + b);

//익명함수
const sum2 = function(a,b){
    return a+b
}

//arguments 활용(인수 많을 시 사용)
function sum3() {
    console.log(arguments);
    return arguments[0] + arguments[1]
}
console.log(sum3(7,3));