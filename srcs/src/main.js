import Vue from 'vue'
import App from './App.vue'
import Vuex from 'vuex'
import VueRouter from 'vue-router'
import routes from './router/router';
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import store from './store/'
// import Scheduler from './components/scheduler';


Vue.config.productionTip = false;

Vue.use(Vuex);
Vue.use(ElementUI);
Vue.use(VueRouter);



const router = new VueRouter({
  routes
});


new Vue({
    router,
    store,
    render: h => h(App),
}).$mount('#app');
