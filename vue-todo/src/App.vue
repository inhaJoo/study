<template>
  <div id="app">
      <TodoHeader></TodoHeader>
      <TodoInput ></TodoInput>
      <TodoList></TodoList>
      <TodoFooter></TodoFooter>
      <DemoList></DemoList>
      <!-- <TodoInput v-on:하위 컴포넌트에서 발생시킨 이벤트 이름="현재 컴포넌트의 메서드 이름"></TodoInput> -->
      <!-- <TodoList v-bind:내려보낼 프롭스 속성 이름="현재 위치의 컴포넌트 속성 이름"></TodoList> -->
      <!-- 
        v-on:addTodoItem="addOneItems"
        v-bind:propsdata="todoItems" 
        v-on:removeItem="removeOneItem"  
        v-on:toggleItem="toggleOneItem"
        v-on:clearAll="clearAllItem"
      -->
  </div>
</template>

<script>
import TodoHeader from './components/TodoHeader.vue';
import TodoInput from './components/TodoInput.vue';
import TodoFooter from './components/TodoFooter.vue';
import TodoList from './components/TodoList.vue';
import DemoList from './components/DemoList'

export default {
    // data(){
    //   return {
    //     todoItems:[]
    //   }
    // },
    // methods:{
    //   // mutations
    //   // addOneItems(todoItem) {
    //   //   const obj = {completed:false, item:todoItem};
    //   //   localStorage.setItem(todoItem, JSON.stringify(obj));
    //   //   this.todoItems.push(obj);
    //   // },
    //   // removeOneItem(todoItem, index){
    //   //   localStorage.removeItem(todoItem.item);
    //   //   this.todoItems.splice(index, 1);//splice(시작인덱스, 적용갯수)
    //   // },
    //   // toggleOneItem(todoItem, index){
    //   //   // todoItem.completed = !todoItem.completed; -> 내린 데이터를 다시 올려서 바꾸는 것은 안티패턴, 좋지않음
    //   //   this.todoItems[index].completed = !this.todoItems[index].completed;//위쪽 데이터를 바꿔주는것이 좋음
    //   //   //업데이트
    //   //   localStorage.removeItem(todoItem.item);
    //   //   localStorage.setItem(todoItem.item, JSON.stringify(todoItem));
    //   // },
    //   // clearAllItem(){
    //   //   localStorage.clear();
    //   //   // this.todoItems.splice(0);
    //   //   this.todoItems = [];
    //   // }
    // },
    // created(){
    //   //로컬스토리지에 데이터가 있을때
    //   if(localStorage.length > 0){
    //       for(let i=0; i<localStorage.length; i++){
    //           if(localStorage.key(i) !== 'loglevel:webpack-dev-server') {
    //               this.todoItems.push(JSON.parse(localStorage.getItem(localStorage.key(i))));
    //           }
    //       }
    //   }
    //   //localStorage.key(i) 키 값
    //   //localStorage.getItem(localStorage.key(i)) 키의 해당 값
    //   //JSON.parse() -> 문자열 자바스크립트 객체로 변환
    // },
    components:{
      TodoHeader,
      // 'TodoHeader':TodoHeader,
      TodoInput,
      TodoList,
      TodoFooter,
      DemoList
    }
  }
</script>

<style>
body {
  text-align: center;
  background-color: #F6F6F6;
}
input {
  border-style: groove;
  width: 200px;
}
button {
  border-style: groove;
}
.shadow {
  box-shadow: 5px 10px 10px rgba(0, 0, 0, 0.03);
}
</style>