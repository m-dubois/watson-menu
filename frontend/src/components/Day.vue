<template>
  <div class="day">
    <div class="dayName">{{ dayMenu.day }}</div>
    {{dayMenu}}
    <ul>
      <li>{{ dayMenu.starter.name }}</li>
      <li>{{ dayMenu.meal.mainCourse.name }}</li>
      <li>{{ dayMenu.meal.dessert.name }}</li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "Day",
  props: ["dayMenu"]
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.day {
  xbackground-color: #fbb;
}
.dayName {
  font-size: 2em;
  font-weight: bold;
}
ul {
  display: flex;
  flex-flow: column;
  list-style-type: none;
  padding: 0;
  align-items: stretch;
}
li {
  flex-grow: 300px;
  padding: 30px;
  border: 1px solid #222;
  margin: 10px;
}
</style>
