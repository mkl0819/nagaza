<template>
  <v-container fluid fill-height></v-container>
</template>

<script>
export default {
  data() {
    return {};
  },
  mounted() {
    this.applyAnimation("header-heightup");
    $("#headerTitle").css("font-size", "10vw");
    $("#headerTitle").css("margin", "auto");
    $(".v-toolbar").css("height", "50vh");
    $("#searchBox").css("margin", "auto");
    
    console.log($("#searchBox"));
  },
  methods: {
    loadData({ setter }) {
      setter(this.sampleData);
    },
    search(inputData) {
      this.$router.push({
        name: "place",
        params: {
          inputData: inputData
        }
      });
    },
    noData() {
      return '"' + this.inputData + '"' + " 로 검색한 결과가 없어요 ㅜ_ㅜ";
    },
    applyAnimation(animationName) {
      $(".v-toolbar").css("animation", animationName + " 1s");
      $("#headerTitle").css("animation", animationName + " 1s");
    }
  },
  beforeDestroy() {
    this.applyAnimation("header-heightdown");
    $("#headerTitle").css("font-size", "3vw");
    $("#headerTitle").css("margin", "0 0 0 10px");
    $(".v-toolbar").css("height", "60px");
    $("#searchBox").css("margin", "");
    $("#searchBox").css("margin-right", "10px");
  }
};
</script>