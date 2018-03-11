// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'

Vue.config.productionTip = false

// Filters
Vue.filter('to-uppercase', function (value) {
  return value.toUpperCase()
})
Vue.filter('to-date', function (value) {
  let dt = new Date(value)
  return (('0' + dt.getDate()).slice(-2)) + '/' + (('0' + (dt.getMonth() + 1)).slice(-2)) + '/' + (dt.getFullYear())
})

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  template: '<App/>',
  components: { App }
})
