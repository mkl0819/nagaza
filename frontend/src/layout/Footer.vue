<template>
    <v-footer
      color="indigo"
      absolute
      app
    >
      <span class="white--text">&copy; 2019</span>
    </v-footer>
</template>

<script>
  export default {
    data: () => ({
      links: [
        'Home',
        'About Us',
        'Team',
        'Services',
        'Blog',
        'Contact Us',
      ],
    }),
  }
</script>