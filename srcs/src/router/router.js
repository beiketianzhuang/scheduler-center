import Vue from 'vue'
import VueRouter from 'vue-router';
import Scheduler from '../components/scheduler';

Vue.use(VueRouter);
let routers = [{
    path: '/',
    component: Scheduler
}];
const router = new VueRouter(routers);
export default router;