<template>
  <div class="inputBox shadow">
    <input type="text" v-model="newTodoItem" v-on:keyup.enter="addTodo()">
    <span class="addContainer" v-on:click="addTodo()">
        <i class="addBtn fas fa-plus" aria-hidden="true">+</i>
    </span>

    <Modal v-if="showModal" @close="showModal = false">
    <!--
      you can use custom content here to overwrite
      default content
    -->
      <h3 slot="header">
        경고!
        <i class="closeModalBtn fa fa-times" 
          aria-hidden="true" 
          @click="showModal = false">
          x
        </i>
      </h3>
      <div slot="body">
        아무것도 입력되지 않았습니다.
      </div>
    </Modal>
  </div>
</template>

<script>
import Modal from './common/AlertModal.vue'
//import { mapMutations } from 'vuex';

//default는 한개의 파일에서 하나만 export 됨.
export default {
    data(){
        return {
            newTodoItem:'',
            showModal: false
        }
    },
    methods:{
      // ...mapMutations({
      //   addTodo : 'addOneItems',
      //   clearInput(){
      //     this.newTodoItem = '';
      //   }
      // })
        addTodo(){
            if(this.newTodoItem !== ''){
                // this.$emit('이벤트 이름', 인자1, 인자2, ...)
                // this.$emit('addTodoItem', this.newTodoItem);
                this.$store.commit('addOneItems', this.newTodoItem);
                this.clearInput();
            }else {
              this.showModal = !this.showModal;
            }
        },
        clearInput(){
            this.newTodoItem = '';
        }
    },
    components:{
      Modal
    }
}
</script>

<style scoped>
input:focus {
  outline: none;
}
.inputBox {
  background: white;
  height: 50px;
  line-height: 50px;
  border-radius: 5px;
}
.inputBox input {
  border-style: none;
  font-size: 0.9rem;
}
.addContainer {
  float: right;
  background: linear-gradient(to right, #6478FB, #8763FB);
  display: block;
  width: 3rem;
  border-radius: 0 5px 5px 0;
}
.addBtn {
  color: white;
  vertical-align: middle;
}

.closeModalBtn {
  color : #42b983;
}
</style>