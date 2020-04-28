/*
*	@author Ilona Bozhe (github.com/warmte)
*/

import Vue from 'vue'
import VueRouter from "vue-router";
import App from './App.vue'
import Index from './components/middle/IndexPage.vue'
import Blog from './components/middle/BlogPage.vue'
import TextPage from "./components/middle/TextPage";

Vue.config.productionTip = false;
Vue.use(VueRouter)

import data from './data';

const routes = [
    {path: '/index', component: Index},
    {path: '/', component: Index},
    {path: '', component: Index},
    {path: '/blog', component: Blog},
    {path: '/blog/:id', component: TextPage}
]

const router = new VueRouter({
    routes, // short for `routes: routes`
    scrollBehavior () {
        return { x: 0, y: 0 }
    }
})

Vue.use(require('vue-social-sharing'));

new Vue({
    router,
    data: function () {
        return data;
    },
    render: h => h(App)
}).$mount('#app');