// 콜백  Callback
// 함수의 인수로 사용되는 함수
// 특정 위치에서 실행위치를 보장하는 용도로 활용

//setTimeOut(함수, 시간)

function timeout(callback){
    setTimeout(()=>{
        console.log('Heropy!');
        callback();
    }, 3000)
}
timeout(()=> {
    console.log('Done!');
});
