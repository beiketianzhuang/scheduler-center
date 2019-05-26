import fetch from '@/config/fetch'
export const getJobInfo = () => fetch('/scheduler/jobs');
