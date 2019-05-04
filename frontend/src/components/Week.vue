<template>
  <div class="week">
    <div class="weekDays">weekDays</div>
    <div class="daysContainer">
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
  background-color: #bbf;
}
.weekDays {
  font-size: 2em;
  font-weight: bold;
}

.daysContainer {
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  grid-template-rows: 40px repeat(3, 1fr);
  grid-column-gap: 20px;
  grid-auto-flow: column;
}
</style>
