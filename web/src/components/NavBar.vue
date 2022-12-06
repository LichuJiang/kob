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
      <ul class = "navbar-nav" v-if="$store.state.user.is_login">
         <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            {{$store.state.user.username}}
          </a>
          <ul class="dropdown-menu">
            <router-link class = "dropdown-item" :to = "{name : 'user_bot_index'}">My Bots</router-link>
            <li><a class="dropdown-item" href="#" @click="logout">Exit</a></li>
          </ul>
        </li>
      </ul>
      <ul class = "navbar-nav" v-else-if="!$store.state.user.pulling_info">
         <li class="nav-item">
          <router-link class="nav-link" :to="{name: 'user_account_login'}" role="button">
            Login
          </router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" :to="{name: 'user_account_register'}" role="button">
            Register
          </router-link>
        </li>
      </ul>
      
    </div>
  </div>
</nav>
</template>

<script>
import {useRoute} from 'vue-router'
import {computed} from 'vue'
import {useStore} from 'vuex'

export default {
    setup() {
      const store = useStore();
      const route = useRoute();
      let route_name = computed(()=>route.name);

    const logout = () => {
        store.dispatch("logout");
    }

      return {
        route_name,
        logout,
      }
    }
}
</script>

<style scoped>

</style>