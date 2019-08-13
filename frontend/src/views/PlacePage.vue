<template>
  <v-container fluid  >
    <!-- <h1>THIS IS PLACE PAGE : {{inputData}}</h1> -->
    <!-- <h1>THIS IS PLACE PAGE : {{this.$route.params.inputData}}</h1> -->
    <!-- <router-link to="test">test</router-link> -->
    <div class="search-info">
      <h1>'{{inputData}}'(으)로 검색한 결과입니다.</h1>
    </div>
    <PlaceList :inputData="$route.params.inputData"></PlaceList>
  </v-container>
</template>

<script>
import PlaceList from "../component/PlaceList.vue";
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
    console.log(this.inputData, "현재입니다", this.$route.params.inputData);

    this.inputData = this.$route.params.inputData;
  },
  methods: {}
};
</script>

<style >
.search-info {
  width: 100%;
}
h1 {
  text-align: center;
}
</style>
