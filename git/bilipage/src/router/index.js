import { createRouter, createWebHashHistory } from 'vue-router'


const routes = [
  {
    path: '/',
    redirect: '/home'
  },
  {
    path: '/login',
    name: 'login',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/login.vue')
  },
  {
    path: '/home',
    name: 'home',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/home.vue')
  },
  {
    path: '/userspace',
    name: 'userspace',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/userspace.vue')
  },
  {
    path:'/uploadavatar',
    name:'uploadavatar',
    component: () => import(/* webpackChunkName: "about" */ '../views/uploadavatar.vue')
  },
  {
    path:'/anime',
    name:'anime',
    component: () => import(/* webpackChunkName: "about" */ '../views/anime.vue')
  },
  {
    path:'/game',
    name:'game',
    component: () => import(/* webpackChunkName: "about" */ '../views/game.vue')
  },
  {
    path:'/submit',
    name:'submit',
    component: () => import(/* webpackChunkName: "about" */ '../views/UploadPage.vue')
  },
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

// router.beforeEach(to, from, next){
//   next()
// }

export default router
