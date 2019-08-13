<template>
  <v-container style="display:block">
    <v-layout row wrap pa-5>
      <v-flex xs12 md4 v-for="place in placeList" :key="place.id">
        <Place
          :key="place.id"
          :p="place"
          :id="place.id"
          :name="place.fcltyNm"
          :address="place.rdnmadr"
          :imgurl="getUrl(place.imgurl)"
        ></Place>
      </v-flex>
    </v-layout>
  </v-container>
</template>

<script>
import PlaceService from "../services/placeService";
import Place from "./Place.vue";
export default {
  name: "PlaceList",
  props: ["inputData"],
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
    getUrl(imgurl) {
      if (imgurl == "../assets/image/warning.png") {
        return require("../assets/image/warning.png");
      } else return imgurl;
    },
    async getPlaces() {
      this.placeList = await PlaceService.getPlacesByFcltyNmLike(
        this.inputData
      );
    }
  }
};
</script>
