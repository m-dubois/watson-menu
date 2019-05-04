<template>
  <div :class="dayClass(dayMenu)">
    <div class="dayName">{{ dayMenu.dayOfWeek + ' ' + dayMenu.day }}</div>
    <div class="course starter">{{ dayMenu.meal.starter.name }}</div>
    <div class="course main-course">{{ dayMenu.meal.mainCourse.name }}</div>
    <div class="course dessert">{{ dayMenu.meal.dessert.name }}</div>
  </div>
</template>

<script>
export default {
  name: "Day",
  props: ["dayMenu"],
  methods: {
    dayClass(dayMenu) {
      return 'day ' + dayMenu.dayOfWeek;
    }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.dayName {
    font-weight: 700;
    font-size: 1.5em;
    justify-self: center;
    align-self: center;
}
.day {
    display: contents;
}
.Lundi, .Mardi, .Jeudi, .Vendredi {
    grid-row: 1 / span 4;
}
.course {
    margin: 5px;
}
.starter { background-color: blueviolet; }
.main-course { background-color: brown; }
.dessert { background-color: coral; }

</style>
