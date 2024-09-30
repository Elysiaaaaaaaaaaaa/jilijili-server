import axios from 'axios'
import login from './request'

const loginApi = data => {
    return axios.post(
        '/api/login',
        data)
}

const registerApi = data => {
    return login.post({
        url: '/api/register',
        data
    })
}

export default {
    loginApi,
    registerApi
}