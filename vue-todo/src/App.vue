<template>
  <div id="app">
      <TodoHeader></TodoHeader>
      <!-- <TodoInput v-on:하위 컴포넌트에서 발생시킨 이벤트 이름="현재 컴포넌트의 메서드 이름"></TodoInput> -->
      <TodoInput v-on:addTodoItem="addOneItems"></TodoInput>
      <!-- <TodoList v-bind:내려보낼 프롭스 속성 이름="현재 위치의 컴포넌트 속성 이름"></TodoList> -->
      <TodoList v-bind:propsdata="todoItems" 
                v-on:removeItem="removeOneItem" 
                v-on:toggleItem="toggleOneItem">
      </TodoList>
      <TodoFooter v-on:clearAll="clearAllItem"></TodoFooter>
  </div>
</template>

<script>
import TodoHeader from './components/TodoHeader.vue';
import TodoInput from './components/TodoInput.vue';
import TodoFooter from './components/TodoFooter.vue';
import TodoList from './components/TodoList.vue';

export default {
    data(){
      return {
        todoItems:[]
      }
    },
    methods:{
      addOneItems(todoItem) {
        const obj = {completed:false, item:todoItem};
        localStorage.setItem(todoItem, JSON.stringify(obj));
        this.todoItems.push(obj);
      },
      removeOneItem(todoItem, index){
        localStorage.removeItem(todoItem.item);
        this.todoItems.splice(index, 1);//splice(시작인덱스, 적용갯수)
      },
      toggleOneItem(todoItem, index){
        // todoItem.completed = !todoItem.completed; -> 내린 데이터를 다시 올려서 바꾸는 것은 안티패턴, 좋지않음
        this.todoItems[index].completed = !this.todoItems[index].completed;//위쪽 데이터를 바꿔주는것이 좋음
        //업데이트
        localStorage.removeItem(todoItem.item);
        localStorage.setItem(todoItem.item, JSON.stringify(todoItem));
      },
      clearAllItem(){
        localStorage.clear();
        // this.todoItems.splice(0);
        this.todoItems = [];
      }
    },
    created(){
        if(localStorage.length > 0){
            for(let i=0; i<localStorage.length; i++){
                if(localStorage.key(i) !== 'loglevel:webpack-dev-server') {
                    this.todoItems.push(JSON.parse(localStorage.getItem(localStorage.key(i))));
                }
            }
        }
    },
    components:{
      TodoHeader,
      // 'TodoHeader':TodoHeader,
      TodoInput,
      TodoList,
      TodoFooter
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