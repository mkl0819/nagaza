import $ from 'jquery'
import axios from 'axios'
import { log } from 'util';

const api = 'H4YpZjH54XeY1eJpAQgVGYuROd2mS%2FvkjPv63PwxmRUEp%2BBDRUPaKmidYHJlSSbomBSj5zpjG2jVVT8KrUXa%2FQ%3D%3D'

let BASE_URL = 'http://localhost:8080/api/place/'

export default {
    getPlaces() {
        let url = BASE_URL + 'getPlaces'
        return axios.get(url).then(response => {
            return response.data;
        })
        
        // var url = 'http://api.data.go.kr/openapi/museum-artgr-info-std'; /*URL*/
        // var queryParams = '?' + encodeURIComponent('ServiceKey') + '=' + api; /*Service Key*/
        // queryParams += '&' + encodeURIComponent('pageNo') + '=' + encodeURIComponent('1'); /*페이지 번호*/
        // queryParams += '&' + encodeURIComponent('numOfRows') + '=' + encodeURIComponent('10'); /*한 페이지 결과 수*/
        // queryParams += '&' + encodeURIComponent('type') + '=' + encodeURIComponent('xml'); /*XML/JSON 여부*/
        
        // return axios.get(url+queryParams).then(response =>{
        //     console.log(response.data);
        //     return response.data;
        // })

        // $.ajax({
        //     crossOrigin: true,
        //     dataType: 'json',
        //     url: url+queryParams,
        //     beforeSend : function(xhr){
        //         xhr.setRequestHeader("ApiKey", "asdfasxdfasdfasdf");
        //         xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
        //     },
        //     success:function (data) {
        //         console.log("성공", data);
        //     },
        //     error: function (err) {
        //         console.log("실패", err);
                
        //     }
        // })

        // $.getJSON(url+queryParams+"&callback=?", function(data){
        //     console.log(data);
            
        // })
    }
}