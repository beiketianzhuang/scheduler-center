const mutations = {
    saveJob(state, jobInfo){
        console.debug(jobInfo);
        state.jobInfo = jobInfo;
    }
};

export default mutations;