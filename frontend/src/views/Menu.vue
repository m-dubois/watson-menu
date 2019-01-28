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
  mounted() {
    axios
      .get(`/api/v1/menus?day=2018-12-31`)
      .then(response => {
        this.dayMenus = response.data;
      })
      .catch(error => {
        this.response = "An error occurred. Sorry :(";
        this.errors.push(error);
        console.log(error);
      })
      .finally(() => (this.loading = false));
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