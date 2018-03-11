<template>
  <div>
    <h1>Day View</h1>
    <div>
      <h2>{{ menus[0].date | to-date }}</h2>
      <ul>
        <li>{{ menus[0].starter }}</li>
        <li>{{ menus[0].main }}</li>
        <li>{{ menus[0].dessert }}</li>
      </ul>
    </div>
  </div>
</template>
<script>
import data from '../data'

export default {
  data () {
    return {
      menus: data.menus
    }
  }
}
</script>
<style scoped>
</style>
