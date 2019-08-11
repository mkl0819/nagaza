<template>
  <v-container fluid fill-height>
    <!-- <h1>THIS IS PLACE PAGE : {{inputData}}</h1> -->
    <!-- <h1>THIS IS PLACE PAGE : {{this.$route.params.inputData}}</h1> -->
    <!-- <router-link to="test">test</router-link> -->
    <PlaceList></PlaceList>
  </v-container>
</template>

<script>
import PlaceList from "../component/PlaceList";
export default {
  data() {
    return {
      inputData: ""
    };
  },
  components: {
    PlaceList
  },
  mounted() {
    this.inputData = this.$route.params.inputData;
  },
  methods: {}
};
</script>
