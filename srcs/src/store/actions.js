import axios from 'axios'

axios.defaults.baseURL = 'http://localhost:8081';


const actions = {
    getJobs({commit}){
        axios.get("/scheduler/jobs",{withCredentials:false}).then(data=>{
            let res=data.data;
            console.log(res);
            commit("saveJob",res)
        })
    }
};

export default actions;