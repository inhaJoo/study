import random from './ch2/getRandom.js'
//조건문  (IF statement)
const a = random();

switch(a){
    case 0:
        console.log('a is 0');
        break;
    case 2:
        console.log('a is 0');
        break;
    case 4:
        console.log('a is 0');
        break;
    default:
        console.log('rest...');
        break;//생략가능
}


if(a === 0){
    console.log('a is 0');
}else if(a === 2){
    console.log('a is 2');
}else if(a === 4){
    console.log('a is 4');
}else{
    console.log('rest...');
}