<template>
  <v-app-bar app :src="imgSrc">
    <!-- toolbar -->
    <!-- <v-app-bar-nav-icon @click="drawer()"></v-app-bar-nav-icon> -->
    <!-- center -->
    <div id="headerTitle" class="Montserrat blackF italic" @click="gohome()">
      NAGAZA
      <!-- <span id="headerTitle" class="Montserrat blackF italic" @click="gohome()">NAGAZA</span> -->
    </div>
    <SearchBox id="searchBox" v-on:inputData="search" />
  </v-app-bar>
</template>

<script>
import SearchBox from "../component/SearchBox.vue";

export default {
  name: "Header",
  data() {
    return {
      imgSrc: require("../assets/header.jpg")
    };
  },
  components: {
    SearchBox
  },
  mounted() {},
  methods: {
    search(inputData) {
      this.$emit("inputData", inputData);
    },
    gohome() {
      this.$route.name === "home" ? this.$router.go() : this.$router.push("/");
    },
    drawer() {
      this.$emit("drawer");
    }
  }
};
</script>

<style>
.v-toolbar__content {
  height: 100% !important;
  display: block !important;
}
.v-image {
  height: auto !important;
}
.v-input {
  margin-top: 0px !important;
}
</style>

<style scoped>
.layout {
  /* height: calc(100% - 80px); */
}
#headerTitle {
  font-size: 3vw;
  color: rgba(255, 255, 255, 0.829);
  text-shadow: 0 0 15px #e0d3ff;
  text-align: center;
  margin-top: calc(100% - 50px);
}
.v-toolbar {
  height: 60px;
}
</style>
