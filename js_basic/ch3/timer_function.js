// 타이머 함수
//  setTimeout(항수, 시간): 일정 시간 후 함수 실행
//  setInterval(함수, 시간): 시간 간격마다 함수 실행
//  clearTimeout(): 설정된 Timeout 함수를 종료
//  clearInterval(): 설정된 Interval 함수를 종료

setTimeout(function(){
    console.log('Heropy!');
}, 3000);//1000ms = 1초

const timer = setTimeout(() => {
    console.log('Heropy2');
}, 3000);

const h1E1 = document.querySelector('h1');
h1E1.addEventListener('click', () => {
    console.log("타이머종료");
    clearTimeout(timer);
    clearInterval(interval);
});

const interval = setInterval(() => {
    console.log('Interval');
}, 3000);

