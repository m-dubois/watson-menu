<template>
  <form>
    <div class="mdl-grid">
      <div class="mdl-cell mdl-cell--4-col mdl-cell--8-col-tablet">
        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label is-upgraded is-dirty">
          <input id="date" v-model="date" type="date" class="mdl-textfield__input"/>
          <label for="date" class="mdl-textfield__label"></label>
        </div>
        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label is-upgraded is-dirty">
          <input id="starter" v-model="starter" type="text" class="mdl-textfield__input"/>
          <label for="starter" class="mdl-textfield__label">Starter</label>
        </div>
        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label is-upgraded is-dirty">
          <input id="main" v-model="main" type="text" class="mdl-textfield__input"/>
          <label for="main" class="mdl-textfield__label">Main dish</label>
        </div>
        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label is-upgraded is-dirty">
          <input id="dessert" v-model="dessert" type="text" class="mdl-textfield__input"/>
          <label for="dessert" class="mdl-textfield__label">Dessert</label>
        </div>
        <div class="actions">
          <a @click.prevent="addMenu" class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored">
            Add menu
          </a>
        </div>
      </div>
    </div>
  </form>
</template>

<script>
// import parse from 'xml-parser'
export default {
  data () {
    return {
      date: '',
      starter: '',
      main: '',
      dessert: ''
    }
  },
  /*
  mounted () {
    this.$http.get('https://thecatapi.com/api/images/get?format=xml&results_per_page=1').then(response => {
      this.catUrl = parse(response.body).root.children['0'].children['0'].children['0'].children['0'].content
    })
  },
  */
  methods: {
    addMenu () {
      console.log('addMenu')
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>
</style>
