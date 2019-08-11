<template>
  <v-app>
    <!-- <Navbar :navtrigger="navtrigger"></Navbar> -->
    <Header v-on:drawer="nav" v-on:inputData="search"></Header>
    <v-content>
      <router-view :key="$route.fullPath" />
    </v-content>
    <Footer v-if="!isHome()"></Footer>
  </v-app>
</template>

<script>
import Header from "./layout/Header.vue";
import Navbar from "./layout/Navbar.vue";
import Footer from "./layout/Footer.vue";

import fontstyle from "./css/font.css";
import mainstyle from "./css/main.css";

export default {
  name: "App",
  data() {
    return {
      navtrigger: false
    };
  },
  components: {
    Header,
    Navbar,
    Footer
  },
  mounted() {},
  beforeRouteUpdate(to) {
    console.log(to.params.inputData);
  },
  methods: {
    nav() {
      this.navtrigger = !this.navtrigger;
    },
    isHome() {
      return this.$route.name == "home" ? true : false;
    },
    search(inputData) {
      this.$router.push({
        name: "place",
        path: "place/" + inputData,
        params: {
          inputData: inputData
        }
      });
    }
  }
};
</script>

<style>
div#app {
  min-height: 100%;
}
</style>
