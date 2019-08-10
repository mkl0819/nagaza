import axios from 'axios'

let BASE_URL = 'http://localhost:8080/api/user/'

export default{
    getUsers(){
        let url = BASE_URL + 'getUsers'
        return axios.get(url).then(response => {
            return response.data;
        })
    },
    getUserByName(name){
        let url = BASE_URL + 'getUserByName/' + name
        return axios.get(url).then(response => {            
            return response.data;
        })
    }
}