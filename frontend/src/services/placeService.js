import axios from 'axios'
import { log } from 'util';

let BASE_URL = 'http://localhost:8080/api/place/'

export default {
    getPlaces() {
        let url = BASE_URL + 'getPlaces'
        return axios.get(url).then(response => {
            // console.log(response.data);
            return response.data;
        })
    },
    getPlaceNames() {
        let url = BASE_URL + 'getPlaceNames'
        return axios.get(url).then(response => {
            return response.data.map((data) => {
                return data.substring(15, data.length - 3)
            })
        })
    },
    getPlacesByFcltyNm(fcltyNm) {
        let url = BASE_URL + 'getPlaces/FcltyNm/' + fcltyNm
        return axios.get(url).then(response => {
            // console.log(response.data);
            return response.data;
        })
    },
    getPlacesByFcltyNmLike(fcltyNm) {
        let url = BASE_URL + 'getPlaces/FcltyNm/Like/' + fcltyNm
        return axios.get(url).then(response => {
            // console.log(response.data);
            return response.data;
        })
    },
    loadPlaces() {
        let url = BASE_URL + 'loadPlaces'
        return axios.get(url).then(response => {
            // console.log(response.data);
            return response.data;
        })
    }
}