// 형 변환(Type conversion)

const a = 1;
const b = '1'

console.log(a == b);// == 동등연산자 -> 형변환 일어남, 자바스크립트에서는 일치연산자로 사용하지 말것

// Truthy(참 같은 값)
//  ture, {}, [], 1, 2, 'false', -12, '3.14' ...

// Falsy(거짓 같은 값)
// false, '', null, undefined, 0, -0, NaN(숫자와 없는 값 연산할때)


if(''){
    console.log(123);
}