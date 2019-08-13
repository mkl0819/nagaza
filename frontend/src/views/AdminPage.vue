<template>

</template>

<script>
import PlaceService from "../services/placeService.js";
import UserService from "../services/userService.js";
export default {
  data() {
    return {
      placeList: [],
      userList: []
    };
  },
  mounted() {
    this.getPlaces();
    this.getUsers();
  },
  methods: {
    async getPlaces() {
      this.placeList = await PlaceService.getPlaces();
    },
    async getUsers() {
      this.userList = await UserService.getUsers();
    }
  }
};
</script>