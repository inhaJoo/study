import Vue from 'vue' 
import Vuex from 'vuex'
import * as getters from './getters'
import * as mutations from './mutations'

Vue.use(Vuex);

//Todo.vue
const storage = {
    fetch() {
        const arr = [];
        //로컬스토리지에 데이터가 있을때
        if(localStorage.length > 0){
            for(let i=0; i<localStorage.length; i++){
                if(localStorage.key(i) !== 'loglevel:webpack-dev-server') {
                    arr.push(JSON.parse(localStorage.getItem(localStorage.key(i))));
                }
            }
        }
        return arr;
    }
}

export const store = new Vuex.Store({
    state: {
        //headerText: 'TODO it!'
        todoItems: storage.fetch(),//3개 컴포넌트에서 쓰임
        price : 100
    },
    getters,
    // getters: {
    //     storedTodoItems(state){
    //         return state.todoItems;
    //     },
    //     originalPrice(state){
    //         return state.price;
    //     },
    //     doublePrice(state) {
    //         return state.price * 2;
    //     },
    //     triplePrice(state) {
    //         return state.price * 3;
    //     }
    // },
    mutations
    // mutations: {
    //     addOneItems(state, todoItem) {
    //         const obj = {completed:false, item:todoItem};
    //         localStorage.setItem(todoItem, JSON.stringify(obj));
    //         state.todoItems.push(obj);
    //     },
    //     removeOneItem(state, playload){
    //         localStorage.removeItem(playload.todoItem.item);
    //         state.todoItems.splice(playload.index, 1);//splice(시작인덱스, 적용갯수)
    //     },
    //     toggleOneItem(state, playload){
    //         // todoItem.completed = !todoItem.completed; -> 내린 데이터를 다시 올려서 바꾸는 것은 안티패턴, 좋지않음
    //         state.todoItems[playload.index].completed = !state.todoItems[playload.index].completed;//위쪽 데이터를 바꿔주는것이 좋음
    //         //업데이트
    //         localStorage.removeItem(playload.todoItem.item);
    //         localStorage.setItem(playload.todoItem.item, JSON.stringify(playload.todoItem));
    //     },
    //     clearAllItem(state){
    //         localStorage.clear();
    //         // this.todoItems.splice(0);
    //         state.todoItems = [];
    //     }
    // }
});
/*
    state 를 mutations로 변경하는 이유
    -여러개의 컴포넌트에서 state값을 변경하는 경우 어느 컴포넌트에서 해당 state 변경했는지 추적 어려움
    -Vue의 반응성을 얻기가 어려움
 */
