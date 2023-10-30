<template>
  <div id="root">
    <ul>
        <li>{{ originalPrice }}</li>
        <li>{{ doublePrice }}</li>
        <li>{{ triplePrice }}</li>
    </ul>
  </div>
</template>

<script>
import { mapGetters } from 'vuex';
export default {
    computed: {
        ...mapGetters(['originalPrice', 'doublePrice', 'triplePrice'])
    }
    
}
</script>

<style>

</style>