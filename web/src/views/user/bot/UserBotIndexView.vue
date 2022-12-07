<template>
    <ContentField>
        My Bots
    </ContentField>
</template>

<script>
import ContentField from '../../../components/ContentField.vue'
import $ from 'jquery'
import {useStore} from 'vuex'
export default {
    components: {
        ContentField
    },
    setup() {
        const store = useStore();
        $.ajax({
            url:"http://127.0.0.1:3000/user/bot/getlist/",
            type:"get",
            headers: {
                Authorization: "Bearer " + store.state.user.token,
            },
            success(resp) {
                console.log(resp);
            },
            error(resp) {
                console.log(resp);
            }
        })
        // const store = useStore();
        // $.ajax({
        //     url:"http://127.0.0.1:3000/user/bot/update/",
        //     type:"post",
        //     data: {
        //         bot_id:7,
        //         title: "bot title7",
        //         description: "bot description7",
        //         content: "bot code7",
        //     },
        //     headers: {
        //         Authorization: "Bearer " + store.state.user.token,
        //     },
        //     success(resp) {
        //         console.log(resp);
        //     },
        //     error(resp) {
        //         console.log(resp);
        //     }
        // })
        // $.ajax({
        //     url:"http://127.0.0.1:3000/user/bot/add/",
        //     type:"post",
        //     data: {
        //         title: "bot title",
        //         description: "bot description",
        //         content: "bot code",
        //     },
        //     headers: {
        //         Authorization: "Bearer " + store.state.user.token,
        //     },
        //     success(resp) {
        //         console.log(resp);
        //     },
        //     error(resp) {
        //         console.log(resp);
        //     }
        // })
        // const store = useStore();
        // $.ajax({
        //     url:"http://127.0.0.1:3000/user/bot/remove/",
        //     type:"post",
        //     data: {
        //         bot_id: 4,
        //     },
        //     headers: {
        //         Authorization: "Bearer " + store.state.user.token,
        //     },
        //     success(resp) {
        //         console.log(resp);
        //     },
        //     error(resp) {
        //         console.log(resp);
        //     }
        // })
    }
}
</script>

<style scoped>

</style>