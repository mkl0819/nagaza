<template>
  <v-container>
    <v-layout row wrap pa-5>
      <v-flex xs12 md4 v-for="place in placeList" :key="place.name">
        <Place :key="place.name" :name="place.name" :description="place.description"></Place>
      </v-flex>
    </v-layout>
  </v-container>
</template>

<script>
import PlaceService from "../services/placeService";
import Place from "./Place.vue";
export default {
  name: "PlaceList",
  data() {
    return {
      placeList: []
    };
  },
  components: {
    Place
  },
  mounted() {
    this.getPlaces();
  },
  methods: {
    async getPlaces() {
      this.placeList = [
        { name: "부산 박물관", description: "부산에 있는 박물관이다." },
        { name: "서울 미술관", description: "서울에 있는 미술관이다." },
        { name: "대전 박물관", description: "부산에 있는 박물관이다." },
        { name: "대구 미술관", description: "서울에 있는 미술관이다." },
        { name: "인천 박물관", description: "부산에 있는 박물관이다." },
        { name: "구리 미술관", description: "서울에 있는 미술관이다." },
        { name: "노원 박물관", description: "부산에 있는 박물관이다." },
        { name: "역삼 미술관", description: "서울에 있는 미술관이다." }
      ];
      //   this.placeList = await PlaceService.getPlaces();
    }
  }
};
</script>
