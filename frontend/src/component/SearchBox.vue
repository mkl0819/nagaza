<template>
  <v-flex >
    <v-autocomplete
      id="inputTextField"
      placeholder="주변의 박물관, 미술관을 검색해보세요"
      solo-inverted
      prepend-inner-icon="search"
      :search-input.sync="inputData"
      :items="components"
      :loading="loading"
      :no-data-text="noData()"
      @keyup.enter="search()"
    ></v-autocomplete>
  </v-flex>
</template>

<script>
export default {
  name: "searchbox",
  props: ['id'],
  data() {
    return {
      components: [
        "테스트",
        "가방",
        "아버지가방에들어가신다",
        "자바스크립트",
        "English Test",
        "javascript",
        "Java스크립트",
        "티셔츠",
        "여름",
        "팥빙수"
      ],
      inputData: "",
      loading: false
    };
  },
  mounted() {
    $(window).click(
      function(e) {
        if (this.inputData == null) {
          this.inputData = this.$route.params.inputData;
        }
      }.bind(this)
    );
    
    $('.v-input')[0].id = this.id;
    console.log($('.v-input')[0].id, this.id)
  },
  methods: {
    loadData({ setter }) {
      setter(this.sampleData);
    },
    search() {
      this.$emit("inputData", this.inputData);
      console.log("searchbox", this.inputData);
      this.inputData = this.$route.params.inputData;
      // this.set();
      $(window).trigger("click");
    },
    noData() {
      return '"' + this.inputData + '"' + " 로 검색한 결과가 없어요 ㅜ_ㅜ";
    }
  }
};
</script>


<style scoped>
.v-input {
  margin: auto;
  margin-top: 12px;
  width: 50vw;
  height: 48px;
  z-index: 6;
}
.flex {
  z-index: 6;
}
.v-menu__content {
  border-radius: 0px 0px 20px 20px !important;
}
.v-messages__message {
  display: none;
}
</style>

