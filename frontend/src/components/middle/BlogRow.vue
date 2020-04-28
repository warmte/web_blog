<template>
    <div class="container">
        <div class="row">
            <BlogPost v-for="post in viewPosts" :post="post" :key="post.id"/>
        </div>
    </div>
</template>

<script>
    import BlogPost from "./BlogPost";

    export default {
        name: "BlogRow",
        props: ['posts', 'size'],
        computed: {
            viewPosts: function () {
                return Object.values(this.posts).sort((a, b) => b.id - a.id).slice(0, this.size);
            }
        },
        components: {
            BlogPost
        }
    }
</script>

<style scoped>

</style>