<template>
  <v-container>
    <ul>
      <li v-for="i in place">{{i}}</li>
    </ul>
  </v-container>
</template>

<script>
export default {
  data() {
    return {
      place: {}
    };
  },
  mounted() {
    this.place = this.$route.params.place;
  }
};
</script>

<style scoped>
</style>