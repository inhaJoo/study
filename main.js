//String

const result = 'Hello World!'.indexOf('World')
console.log(result);

const str = '0123'
console.log('str길이: ',str.length);

console.log('Hello world!'.indexOf('HEROPY') !== -1);
console.log('Hello world!'.slice(6,11));// slice(시작인덱스, 직전인덱스)
console.log('Hello world!'.replace('world', 'HEROPY'));//replace(기존문자열, 변경문자열) + 띄워쓰기 가능
console.log('thesecon@gmail.com'.match(/.+(?=@)/)[0]);//정규표현식
console.log('   Hello world!   '.trim());