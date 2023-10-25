//비교 연산자(comparison operator)

// const a = 13
// const b = 6
// console.log("================비교연산자================");
// console.log(a === b);//일치 연산자, 왼쪽과 오른쪽 데이터 타입, 값 비교

// function isEqual(x, y) {
//     return x === y
// }

// console.log(isEqual(1, 3));
// console.log(isEqual(2, '2'));//숫자, 문자 데이터비교

// console.log(a !== b);// !== 불일치 연산자, 다른지 체크함
// console.log(a < b);
// console.log(a > b);
// console.log(a >= b);// = 기호는 > 뒤에 작성
// console.log(a <= b);

console.log("================논리연산자================");
const a = 1 === 1
const b = 'AB' === 'ABC'
const c = false
console.log(a);
console.log(b);
console.log(c);

console.log('&& : ', a && b && c);// and, 그리고
console.log('|| : ', a || b);// or, 또는
console.log('|| : ', b || c);//true 값 하나이상 있으면 전체 true
console.log('|| : ', a || b || c);
console.log('! :', !a);//not, 부정