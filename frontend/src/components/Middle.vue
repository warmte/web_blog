<template>
    <div class="middle">
        <div id="main">
            <router-view :posts="posts"></router-view>
        </div>
    </div>
</template>
<script>

    export default {
        name: "Middle",
        props: ['posts'],
        data: function () {
            return {
                page: "Index"
            }
        },

        components: {
        }, beforeCreate() {
            this.$root.$on("onChangePage", (page) => {
                this.page = page;
            });
        }
    }
</script>

<style scoped>

</style>
