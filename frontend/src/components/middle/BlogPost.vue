<template>
    <div class="4u" id="blog-post">
        <router-link :to="'/blog/' + post.id"><h2 class="post">{{post.title}}</h2>
        <div class="image full"><img :src="post.image" alt=""/></div>
        </router-link>
        <p class="post-text" v-html="post.text.toString().substr(0, 297).concat('...')"></p>
        <div class="footer">
            <div class="date">
                {{new Intl.DateTimeFormat('en-US', {year: 'numeric', month: 'long', day: 'numeric'}).format(new
                Date(post.date))}}
            </div>
            <router-link :to="'/blog/' + post.id" class="button"> Read post</router-link>
        </div>
    </div>
</template>

<script>
    export default {
        props: ['post'],
        name: "BlogPost"
    }
</script>

<style scoped>

</style>