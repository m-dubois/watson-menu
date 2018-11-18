<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>

      <div>
          <button class=”Search__button” @click="callRestService()">CALL Spring Boot REST backend service</button>
          <h3>{{ response }}</h3>
      </div>

  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

import axios from 'axios'

export default {
  name: 'home',
  components: {
    HelloWorld
  },

data (){
  return {
    response: [],
    errors: []
  }
},
methods: {
    callRestService(){
      axios.get(`api/hello`)
        .then(response => {
          // JSON responses are automatically parsed.
          this.response = response.data
        })
        .catch(e => {
          this.errors.push(e)
          console.log(e);
        })
    }
  }
}
</script>
