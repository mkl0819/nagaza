import Vue from 'vue'
import Router from 'vue-router'

import Homepage from '../views/Homepage.vue'
import Placepage from '../views/Placepage.vue'
import testpage from '../views/testpage.vue'

Vue.use(Router)

export default new Router({
  mode: "history",
  routes: [
    {
      path: '/',
      name: 'home',
      component: Homepage
    },
    {
      path: '/place/:inputData',
      name: 'place',
      component: Placepage
    },
    {
      path: '/test',
      name: 'test',
      component: testpage
    }
  ]
})
