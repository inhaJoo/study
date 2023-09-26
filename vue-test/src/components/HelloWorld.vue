<template>
  <header>
    <h1>{{ propsdata }}</h1>
    <button v-on:click="passData">click</button>
  </header>
</template>

<script>
export default {
  props:['propsdata'],
  methods:{
    passData: function(){
      this.$emit('renew');
    }
  }
}
</script>

<style>

</style>