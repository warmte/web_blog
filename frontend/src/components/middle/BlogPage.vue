<template>
    <div id="featured">
        <BlogRow :posts="posts" :size="ROW_SIZE * cnt"/>
        <div v-if="cnt * ROW_SIZE < Object.values(posts).length">
            <button class="view-more" v-on:click="viewMore">view more</button>
            <button class="view-more" v-on:click="viewAll">view all</button>
        </div>
    </div>
</template>

<script>

    import BlogRow from "./BlogRow";

    export default {
        name: "Blog",
        props: ['posts'],
        data: function() {
            return {
                ROW_SIZE: 6,
                cnt: 1
            }
        },

        components: {
            BlogRow
        },

        methods: {
            viewMore: function () {
                this.$data.cnt += (this.$data.cnt * this.$data.ROW_SIZE < Object.values(this.posts).length ? 1 : 0);
            },
            viewAll: function () {
                this.$data.cnt = Math.ceil(Object.values(this.posts).length / this.$data.ROW_SIZE);
            }
        }
    }
</script>

<style scoped>

</style>
