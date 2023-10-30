<template>
  <div>
    <transition-group name="list" tag="ul">
        <li v-for="(todoItem, index) in storedTodoItems" v-bind:key="todoItem.item" class="shadow">
            <i class="checkBtn fas fa-check" 
              v-bind:class="{checkBtnCompleted: todoItem.completed}" 
              v-on:click="toggleComplete({todoItem, index})">
              check
            </i>
            <span>{{ todoItem.item }}</span>
            <span class="removeBtn" v-on:click="removeTodo({todoItem, index})">
                <i class="removeBtn fas fa-trash-alt">remove</i>
            </span>
        </li>
    </transition-group>
  </div>
</template>

<script>  
import { mapGetters, mapMutations } from 'vuex'
export default {
    // props:['propsdata'],

    // data:function(){
    //     return {
    //         todoItems:[]
    //     }
    // },
    methods:{
        ...mapMutations({
          removeTodo: 'removeOneItem',
          toggleComplete: 'toggleOneItem'
        }),
        // removeTodo(todoItem, index){
        //     this.$store.commit('removeOneItem', {todoItem, index});
        //     //this.$emit('removeItem', todoItem, index);
        //     // App.vue로 이동
        //     // this.todoItems.splice(index, 1);//splice(시작인덱스, 적용갯수)
        //     // localStorage.removeItem(todoItem.item);
        // },
        // toggleComplete(todoItem, index){
        //     this.$store.commit('toggleOneItem', {todoItem, index});
        //     //this.$emit('toggleItem', todoItem, index);
        //     // App.vue로 이동
        //     // todoItem.completed = !todoItem.completed;
        //     // // 업데이트
        //     // localStorage.removeItem(todoItem.item);
        //     // localStorage.setItem(todoItem.item, JSON.stringify(todoItem));
        // },
    },
    computed: {
          // todoItems(){
          //   return this.$store.getters.storedTodoItems;
          // }
          // ...mapGetters({
          //   todoItems: 'storedTodoItems'
          // })
          ...mapGetters(['storedTodoItems'])
        }
    // ,
    // created:function(){
    //     if(localStorage.length > 0){
    //         for(var i=0; i<localStorage.length; i++){
    //             if(localStorage.key(i) !== 'loglevel:webpack-dev-server') {
    //                 this.todoItems.push(JSON.parse(localStorage.getItem(localStorage.key(i))));
    //             }
    //         }
    //     }
    // }
}
</script>

<style scoped>
ul {
  list-style-type: none;
  padding-left: 0px;
  margin-top: 0;
  text-align: left;
}
li {
  display: flex;
  min-height: 50px;
  height: 50px;
  line-height: 50px;
  margin: 0.5rem 0;
  padding: 0 0.9rem;
  background: white;
  border-radius: 5px;
}
.checkBtn {
  line-height: 45px;
  /* color: black; */
  color: #62acde;
  margin-right: 5px;
}
.checkBtnCompleted {
  /* color: #62acde; */
  color: black;
}
.textCompleted {
  text-decoration: line-through;
}
.removeBtn {
  margin-left: auto;
  color: #de4343;
}

/* 리스트 아이템 트랜지션 */
.list-enter-active, .list-leave-active {
  transition: all 1s;
}
.list-enter, .list-leave-to /* .list-leave-active below version 2.1.8 */ {
  opacity: 0;
  transform: translateY(30px);
} 
</style>