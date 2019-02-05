<template>
  <div class="menu">
    <h1>This is the menu</h1>
    <div class="spinnerContainer">
      <Spinner v-if="loading" />
    </div>
    <h3 v-if="!loading">{{ dayMenus }}</h3>
    <week v-if="!loading" v-bind:dayMenus="dayMenus"/>
  </div>
</template>

<script>
import Spinner from "@/components/Spinner.vue";
import Week from "@/components/Week.vue";
import axios from "axios";

export default {
  name: "home",
  components: {
    Spinner,
    Week
  },

  data() {
    return {
      response: null,
      loading: true,
      dayMenus: [],
      errors: []
    };
  },

  methods:{
    loadDayData(date) {
      axios
        .get('/api/v1/menus?day=' + date)
        .then(response => {
          this.dayMenus.push(response.data);
        })
        .catch(error => {
          this.response = "An error occurred. Sorry :(";
          this.errors.push(error);
          console.log(error);
        })
        .finally(() => (this.loading = false));
    }
  },

  mounted() {
    this.loadDayData('2018-12-31');
    this.loadDayData('2019-01-01');
    this.loadDayData('2019-01-02');
    this.loadDayData('2019-01-03');
  }
};
</script>

<style scoped>
.spinnerContainer {
  display: flex;
  align-items: center;
  justify-content: center;
}
</style>