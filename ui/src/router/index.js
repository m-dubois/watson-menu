import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import AddMenu from '@/components/AddMenu'
import DayView from '@/components/DayView'
import WeekView from '@/components/WeekView'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Hello',
      component: Hello
    },
    {
      path: '/add',
      name: 'AddMenu',
      component: AddMenu
    },
    {
      path: '/day',
      name: 'DayView',
      component: DayView
    },
    {
      path: '/week',
      name: 'WeekView',
      component: WeekView
    }
  ]
})
