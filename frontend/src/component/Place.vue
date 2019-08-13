<template>
  <v-layout>
    <v-card flat width="100%" height="30vh" @click="detail(p)">
      <!-- <img :src="imgurl" class="place-image"> -->
      <div class="p-image " :id="id">
        <div class="p-text p-text__title">{{name}}</div>
        <div class="p-text p-text__addr">{{address}}</div>
      </div>
      <div class="hover-image " :id="id">
        <div class="p-text p-text__title">{{name}}</div>
        <div class="p-text p-text__addr">{{address}}</div>
      </div>
      <!-- <v-img :src="imgurl" class="place-image"></v-img>
      <v-card-title class="p-text">{{name}}</v-card-title>
      <div class="p-text">{{address}}</div>-->
      <span class='test'>dkdkdk</span>
    </v-card>
  </v-layout>
</template>

<script>
import $ from "jquery";
export default {
  name: "Place",
  props: ["p", "id", "name", "address", "imgurl"],
  methods: {
    detail(p){
      console.log(p.id);
      console.log(p);
      
      this.$router.push({
        name: "placeDetail",
        path: "placeDetail/" + {'pid': this.p.id},
        params: {
          pid: this.p.id,
          place: this.p
        }
      });
    }
  },
  mounted() {
    console.log(this.img);
    $("#" + this.id).css("background-image", "url(" + this.imgurl + ")");
    console.log($(".p-image").css("background-image"));
  }
};
</script>

<style scoped>
.v-sheet {
  border-radius: 0px !important;
}
.v-card:hover {
  cursor: pointer;
  animation-name: hoverEvent;
  animation-duration: 0.5s;
  opacity: 0.5;
}

.v-card:hover .hover-image {
  display: block;
}

.p-text {
  text-align: center;
  display: table-row;
}
.p-text__title {
  height: 60%;
}
.p-text__addr {
  height: 40%;
}
.p-image {
  width: 100%;
  height: 100%;
  background-position: center;
  background-size: cover;
  display: table;
  position: absolute;
}
.hover-image {
  position: relative;
  background-color: brown;
  display: none;
}
@keyframes hoverEvent {
  0% {
    opacity: 1;
  }
  100% {
    opacity: 0.5;
  }
}
</style>
<style scoped>
.v-image__image {
  background-size: contain !important;
  overflow: hidden;
}
</style>