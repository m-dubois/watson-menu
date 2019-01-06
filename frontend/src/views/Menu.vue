<template>
  <div class="menu">
    <h1>This is the menu</h1>
    <div class="spinnerContainer">
      <Spinner v-if="loading" />
    </div>
    <h3 v-if="!loading">{{ response }}</h3>
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
      dayMenus: [
        {
          day: "Lundi",
          starter: "Salade verte avec carottes râpées et oignons",
          main: "Pizza à la tomate, brocolis et pâtes",
          dessert: "Fromage blanc avec confiture"
        },
        {
          day: "Mardi",
          starter: "Salade de chou rouge râpé",
          main: "Omelette aux fines herbes, épinards à la crème, riz",
          dessert: "Petits suisses avec miel de citronnier"
        },
        {
          day: "Jeudi",
          starter: "Salade verte avec endives et persil",
          main: "Poisson frais à la sauce",
          dessert: "Fromages, Pommes"
        },
        {
          day: "Vendredi",
          starter: "Bouillon de légumes avec vermicelles",
          main: "Poisson pané frais, purée de patates douces, petits pois",
          dessert: "Fromages, Biscuits"
        }
      ],
      errors: []
    };
  },
  mounted() {
    axios
      .get(`api/hello?delay=3`)
      .then(response => {
        this.response = response.data;
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