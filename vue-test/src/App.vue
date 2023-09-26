<template>
  <form v-on:submit.prevent="submitForm">
    <div>
      <label for="username">ID : </label>
      <input id="username" type="text" v-model="username">
    </div>
    <div>
      <label for="password">PW : </label>
      <input id="password" type="password" v-model="password">
    </div>
    <button type="submit">login</button>
    <div>
      <app-header v-bind:propsdata="str"
      v-on:renew="renewStr"></app-header>
    </div>
  </form>
</template>

<script>
import axios from 'axios';
import AppHeader from './components/HelloWorld.vue';

export default {
  data:function(){
    return {
      username: '',
      password: '',
      str : ''
    }
  },
  components:{
    'app-header':AppHeader
  },
  methods: {
    submitForm : function(){
      console.log(this.username, this.password);
      var url = 'https://jsonplaceholder.typicode.com/users';
      var data = {
        username : this.username,
        password : this.password 
      }
      axios.post(url, data)
        .then(function(response){
          console.log(response);
        })
        .catch(function(error){
          console.log(error);
        })
    },
    renewStr:function() {
      this.str = 'hi';
    }
  }
}
</script>

<style>

</style>