//화살표 함수
// () -> {} vs function() {}

const double = function(x) {
    return x * 2
}
console.log('double: ', double(7));

const doubleArrow = (x, y) => x * y//문자, 숫자, 배열 등 데이터 출력됨. 객체 데이터는 ()로 감싸야함
console.log('doubleArrow: ', doubleArrow(7, 2));

const objectArrow = () => ({name: 'hello'})
console.log(objectArrow());