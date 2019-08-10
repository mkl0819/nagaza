<template>
  <div class="hello">
    <div class="main main-raised">
      <v-app-bar
      color="deep-purple accent-4"
      dark
    >
      <v-app-bar-nav-icon></v-app-bar-nav-icon>

      <v-toolbar-title>Page title</v-toolbar-title>

      <v-spacer></v-spacer>

      <v-btn icon>
        <v-icon>mdi-heart</v-icon>
      </v-btn>

      <v-btn icon>
        <v-icon>mdi-magnify</v-icon>
      </v-btn>

      <v-menu
        left
        bottom
      >
        <template v-slot:activator="{ on }">
          <v-btn icon v-on="on">
            <v-icon>mdi-dots-vertical</v-icon>
          </v-btn>
        </template>

        <v-list>
          <v-list-item
            v-for="n in 5"
            :key="n"
            @click="() => {}"
          >
            <v-list-item-title>Option {{ n }}</v-list-item-title>
          </v-list-item>
        </v-list>
      </v-menu>
    </v-app-bar>
     <v-btn small color="error">Error</v-btn>
      <v-btn color="primary" @click="getUsers()">getUsers</v-btn>
      <v-btn color="#033" @click="getMing()">getUsersByName(ming)</v-btn>
      <div><h4 class="title">{{userList}}</h4></div>
      <div><h4 class="title">{{ming}}</h4></div>
      <h1>hi</h1>
    </div>
    
  </div>
</template>

<script>
import UserService from '@/services/userService.js'
import PlaceService from '@/services/placeService.js'

export default {
  name: "hello",
  data() {
    return {
      userList: [],
      ming: 'init'
    };
  },
  watch:{
    userList:function(){
      console.log('user', this.userList);
      
    },
    ming:function(){
      console.log('ming', this.ming);
      
    }
  },
  methods: {
    async getUsers() {
      // console.log(await UserService.getUsers());
      // let data = UserService.getUsers()
      
      // this.userList = await UserService.getUsers();
      this.userList = await PlaceService.getPlaces();
    },
    async getMing(){
      // console.log(await UserService.getUserByName('ming'));
      
      this.ming = await UserService.getUserByName('ming');
    }
  },
  computed: {
    headerStyle() {
      return {
        backgroundImage: `url(${this.image})`
      };
    },
    signupImage() {
      return {
        backgroundImage: `url(${this.signup})`
      };
    }
  }
};
</script>
<style lang="scss">
.section-download {
  .md-button + .md-button {
    margin-left: 5px;
  }
}

@media all and (min-width: 991px) {
  .btn-container {
    display: flex;
  }
}
</style>

