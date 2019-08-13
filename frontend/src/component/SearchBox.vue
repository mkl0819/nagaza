<template>
  <v-flex>
    <v-autocomplete
      id="inputTextField"
      placeholder="주변의 박물관, 미술관을 검색해보세요"
      solo-inverted
      prepend-inner-icon="search"
      :search-input.sync="inputData"
      :loading="loading"
      :items="placeNames"
      clearable
      :no-data-text="noData()"
      @keyup.enter="search()"
    ></v-autocomplete>
    {{inputData}}
  </v-flex>
</template>

<script>
import placeService from "../services/placeService";
export default {
  name: "searchbox",
  props: ["id"],
  data() {
    return {
      placeNames: [],
      inputData: "",
      loading: false
    };
  },
  mounted() {
    this.getPlaceNames();
    $(".v-input")[0].id = this.id;
    // $(window).click(
    //   function(e) {
    //     if (this.inputData != this.$route.params.inputData) {
    //       this.inputData = this.$route.params.inputData;
    //     }
    //   }.bind(this)
    // );
  },
  methods: {
    async getPlaceNames() {
      this.placeNames = await placeService.getPlaceNames();
    },
    search() {
      this.$emit("inputData", this.inputData);
      const list = $(".menuable__content__active");
      list.css("display", "none");
      console.log($(".v-input__slot"));
      const inputslot = $(".v-input__slot")
      // console.log(inputslot.attr());
      // 내일의 민경아 부탁해
      list.removeClass('menuable__content__active')
      inputslot.attr('aria-expanded', 'false')
      console.log($(".v-input__slot"));

      setTimeout(() => {
        const inputText = document.getElementById('inputTextField')
        console.log(inputText);
        console.log(inputText.value);
        
        inputText.value = this.$route.params.inputData;
      }, 200);
    },
    noData() {
      return '"' + this.inputData + '"' + " 로 검색한 결과가 없어요 ㅜ_ㅜ";
    }
  },
  updated() {
    // this.inputData = this.$route.params.inputData;
    // console.log("beforeupdated", this.inputData, this.$route.params.inputData);
    if (this.inputData == null) {
      this.inputData = this.$route.params.inputData;
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
<style>
.v-list-item__mask {
  background-color: #ffff00 !important;
  color: #5300bb !important;
  font-weight: 900 !important;
}
</style>

