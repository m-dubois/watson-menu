<template>
  <div class="week">
    <div class="weekDays"/>
    <div class="dayContainer">
      <day v-for="dayMenu in dayMenus" v-bind:dayMenu="dayMenu" v-bind:key="dayMenu.day"></day>
    </div>
  </div>
</template>

<script>
import Day from "@/components/Day.vue";

export default {
  name: "Week",
  components: {
    Day
  },
  props: ["dayMenus"]
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.week {
  xbackground-color: #bbf;
}
.weekDays {
  font-size: 2em;
  font-weight: bold;
}
.dayContainer {
  display: flex;
  flex-flow: row;
  list-style-type: none;
  padding: 0;
  align-items: stretch;
}
</style>
