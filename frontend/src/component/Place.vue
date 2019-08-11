<template>
  <v-layout>
    <v-card flat width="100%" height="30vh">
      <v-card-title>{{name}}</v-card-title>
      <div>{{description}}</div>
    </v-card>
  </v-layout>
</template>

<script>
export default {
  name: "Place",
  props: ["name", "description"]
};
</script>

<style scoped>
.v-sheet {
  border-radius: 0px !important;
  background-color: rgb(143, 88, 88);
}
.v-card:hover {
  cursor: pointer;
  animation-name: hoverEvent;
  animation-duration: 0.5s;
  opacity: 0.5;
  /* background-color: rgba(0, 0, 0, 0.192); */
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
