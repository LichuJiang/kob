<template>
<nav class="navbar navbar-expand-lg bg-light">
  <div class="container">
    <router-link class = "navbar-brand" :to = "{name : 'home'}">King of Bots</router-link>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav me-auto">
        <li class="nav-item">
          <router-link :class="route_name == 'pk_index' ? 'nav-link active':'nav-link'" :to = "{name : 'pk_index'}">Contests</router-link>
        </li>
        <li class="nav-item">
          <router-link :class="route_name == 'record_index' ? 'nav-link active':'nav-link'" :to = "{name : 'record_index'}">Matches</router-link>
        </li>
        <li class="nav-item">
            <router-link :class="route_name == 'ranklist_index' ? 'nav-link active':'nav-link'" :to = "{name : 'ranklist_index'}">Ranking</router-link>
        </li>
       
      </ul>
      <ul class = "navbar-nav">
         <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            lichu jiang
          </a>
          <ul class="dropdown-menu">
            <router-link class = "dropdown-item" :to = "{name : 'user_bot_index'}">My Bots</router-link>
            <li><a class="dropdown-item" href="#">Exit</a></li>
          </ul>
        </li>
      </ul>
      
    </div>
  </div>
</nav>
</template>

<script>
import {useRoute} from 'vue-router'
import {computed} from 'vue'

export default {
    setup() {
      const route = useRoute();
      let route_name = computed(()=>route.name);
      return {route_name}
    }
}
</script>

<style scoped>

</style>