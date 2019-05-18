import Vue from 'vue'
import App from './App.vue'
import Vuex from 'vuex'
import router from './router/router';
import ElementUI from 'element-ui';
// import Scheduler from './components/scheduler';


Vue.config.productionTip = false;

Vue.use(Vuex);
Vue.use(ElementUI);
new Vue({
  router,
  render: h => h(App),
}).$mount('#app');
