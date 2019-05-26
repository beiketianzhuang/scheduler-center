import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex);

import jobStore from './modules/job/'

const store = new Vuex.Store({
    modules:{
        jobStore,
    }
});
export default store;